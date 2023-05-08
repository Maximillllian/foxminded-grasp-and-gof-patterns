package structural_patterns.adapter;

import structural_patterns.adapter.external_library.Dokumentinformationen;

import java.util.Date;

public class DocumentInformationImpl implements DocumentInformation {
    private Dokumentinformationen documentInformation;
    public DocumentInformationImpl() {
        this.documentInformation = new Dokumentinformationen();
    }

    public DocumentInformationImpl(Dokumentinformationen documentInformation) {
        this.documentInformation = documentInformation;
    }

    public Dokumentinformationen getOriginalInstance() {
        return this.documentInformation;
    }

    @Override
    public String getDocumentNumber() {
        return documentInformation.getDokumentnummer();
    }

    @Override
    public String getRecipientId() {
        return documentInformation.getEmpfängerId();
    }

    @Override
    public String getSenderId() {
        return documentInformation.getAnsenderId();
    }

    @Override
    public String getDocumentsName() {
        return documentInformation.getDokumentsName();
    }

    @Override
    public Date getDocumentsDate() {
        return documentInformation.getDokumentsDatum();
    }

    @Override
    public byte[] getFileContent() {
        return documentInformation.getDateinhalt();
    }

    @Override
    public void setRecipientId(String recipientId) {
        documentInformation.setEmpfängerId(recipientId);
    }

    @Override
    public void setSenderId(String senderId) {
        documentInformation.setAnsenderId(senderId);
    }

    @Override
    public void setDocumentsName(String documentsName) {
        documentInformation.setDokumentsName(documentsName);
    }

    @Override
    public void setFileContent(byte[] fileContent) {
        documentInformation.setDateinhalt(fileContent);
    }

    @Override
    public void setDocumentDate(Date documentDate) {
        documentInformation.setDokumentsDatum(documentDate);
    }
}
