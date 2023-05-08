package structural_patterns.adapter;

import structural_patterns.adapter.external_library.Dokumentinformationen;

import java.util.Date;

public interface DocumentInformation {
    public Dokumentinformationen getOriginalInstance();
    public String getDocumentNumber();
    public String getRecipientId();
    public String getSenderId();
    public String getDocumentsName();
    public Date getDocumentsDate();
    public byte[] getFileContent();
    public void setRecipientId(String recipientId);
    public void setSenderId(String senderId);
    public void setDocumentsName(String documentsName);
    public void setFileContent(byte[] fileContent);
    public void setDocumentDate(Date documentDate);
}
