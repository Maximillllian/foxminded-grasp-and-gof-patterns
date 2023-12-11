package structural_patterns.facade.soap;

import org.w3c.dom.Document;
import structural_patterns.facade.calculator.org.tempuri.Add;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

public class CalculatorSOAP {
    // Default logger
    private static final Logger LOG = Logger.getLogger(String.valueOf(CalculatorSOAP.class));

    // The SOAP server URI
    private String uriSOAPServer = "http://www.dneonline.com/calculator.asmx";
    private String actionUrl = "http://tempuri.org/";
    // The SOAP connection
    private SOAPConnection soapConnection = null;

    // If you want to add namespace to the header, follow this constant
    private static final String PREFIX_NAMESPACE = "ns";
    private static final String NAMESPACE = "http://other.namespace.to.add.to.header";

    /**
     * A constructor who creates a SOAP connection
     *            the SOAP server URI
     */
    public CalculatorSOAP() {
        try {
            createSOAPConnection();
        } catch (UnsupportedOperationException | SOAPException e) {
//            LOG.log(e.getMessage());
        }
    }

    /**
     * Create a SOAP connection
     *
     * @throws UnsupportedOperationException
     * @throws SOAPException
     */
    private void createSOAPConnection() throws UnsupportedOperationException,
        SOAPException {

        // Create SOAP Connection
        SOAPConnectionFactory soapConnectionFactory;
        soapConnectionFactory = SOAPConnectionFactory.newInstance();
        soapConnection = soapConnectionFactory.createConnection();
    }

    public <T> T sendMessageToSOAPServer(Object body, String operation, Class<T> responseClass)  {

        try {
            // Send SOAP Message to SOAP Server
            final SOAPMessage soapResponse = soapConnection.call(
                createSOAPRequest(body, operation),
                uriSOAPServer);
//            soapResponse.setName
            var out = new ByteArrayOutputStream();
            soapResponse.writeTo(out);
            String strMsg = new String(out.toByteArray());
            // Print SOAP Response
            LOG.info("Response SOAP Message : " + strMsg);
            var jc = JAXBContext.newInstance(responseClass);
            var unmarshaller = jc.createUnmarshaller();
            return (T) unmarshaller.unmarshal(soapResponse.getSOAPBody().extractContentAsDocument());
        } catch (SOAPException | JAXBException | ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private SOAPMessage createSOAPRequest(Object body, String operation) throws SOAPException, JAXBException, ParserConfigurationException {
        final MessageFactory messageFactory = MessageFactory.newInstance();
        final SOAPMessage soapMessage = messageFactory.createMessage();
        final SOAPPart soapPart = soapMessage.getSOAPPart();

        // SOAP Envelope
        final SOAPEnvelope envelope = soapPart.getEnvelope();
//        envelope.addNamespaceDeclaration(PREFIX_NAMESPACE, NAMESPACE);

        // SOAP Body
        final SOAPBody soapBody = envelope.getBody();

        JAXBContext jc = JAXBContext.newInstance(body.getClass());
        // Create the Document
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.newDocument();

        // Marshal the Object to a Document
        var marshaller = jc.createMarshaller();
        marshaller.marshal(body, document);

        soapBody.addDocument(document);

        // Mime Headers
        final MimeHeaders headers = soapMessage.getMimeHeaders();
        LOG.info("SOAPAction : " + actionUrl + operation);
        headers.addHeader("SOAPAction", actionUrl + operation);

        soapMessage.saveChanges();

        /* Print the request message */
        LOG.info("Request SOAP Message :" + soapMessage.toString());
        return soapMessage;
    }
}
