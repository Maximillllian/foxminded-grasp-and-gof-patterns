package structural_patterns.facade.soap;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.soap.*;
import lombok.extern.slf4j.Slf4j;
import structural_patterns.facade.calculator.org.tempuri.AddResponse;

import java.net.URL;
import java.util.logging.Logger;

public class CalculatorSOAP {
    // Default logger
    private static final Logger LOG = Logger.getLogger(String.valueOf(CalculatorSOAP.class));

    // The SOAP server URI
    private String uriSOAPServer;
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
        this.uriSOAPServer = "http://www.dneonline.com/calculator.asmx";

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

    public <T> T sendMessageToSOAPServer(String body, String operation, Class<T> responseClass)  {

        try {
            // Send SOAP Message to SOAP Server
            final SOAPMessage soapResponse = soapConnection.call(
                createSOAPRequest(body, operation),
                uriSOAPServer);

            // Print SOAP Response
            LOG.info("Response SOAP Message : " + soapResponse.toString());
            var jc = JAXBContext.newInstance(responseClass);
            var unmarshaller = jc.createUnmarshaller();
            return (T) unmarshaller.unmarshal(soapResponse.getSOAPBody());
        } catch (SOAPException | JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    private SOAPMessage createSOAPRequest(String body, String operation) throws SOAPException {
        final MessageFactory messageFactory = MessageFactory.newInstance();
        final SOAPMessage soapMessage = messageFactory.createMessage();
        final SOAPPart soapPart = soapMessage.getSOAPPart();

        // SOAP Envelope
        final SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration(PREFIX_NAMESPACE, NAMESPACE);

        // SOAP Body
        final SOAPBody soapBody = envelope.getBody();
        soapBody.addChildElement(body);

        // Mime Headers
        final MimeHeaders headers = soapMessage.getMimeHeaders();
        LOG.info("SOAPAction : " + uriSOAPServer + operation);
        headers.addHeader("SOAPAction", uriSOAPServer + operation);

        soapMessage.saveChanges();

        /* Print the request message */
        LOG.info("Request SOAP Message :" + soapMessage.toString());
        return soapMessage;
    }
}
