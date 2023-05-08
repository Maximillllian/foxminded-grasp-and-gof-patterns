package structural_patterns.adapter.deprecated.entities;

import java.util.Date;

public class DocumentInfo {
    private Date documentDate;
    private Date signDate;
    private String documentNumber;
    private byte[] data;
    private String senderId;
    private String receiverId;

    public DocumentInfo(
            Date documentDate, Date signDate, String documentNumber, byte[] data, String senderId, String receiverId) {
        this.documentDate = documentDate;
        this.signDate = signDate;
        this.documentNumber = documentNumber;
        this.data = data;
        this.senderId = senderId;
        this.receiverId = receiverId;
    }

    public Date getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Date documentDate) {
        this.documentDate = documentDate;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }
}
