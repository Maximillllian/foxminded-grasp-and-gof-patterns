package com.company.entities;

import java.util.Date;

public class Dokumentinformationen {

    private String documentsName;
    private byte[] dateinhalt;
    private Date documentsDatum;
    private String empfängerId;

    public String getDokumentnummer() {
        return Dokumentnummer;
    }

    private String Dokumentnummer;

    public String getEmpfängerId() {
        return empfängerId;
    }

    public void setEmpfängerId(String empfängerId) {
        this.empfängerId = empfängerId;
    }

    public String getAnsenderId() {
        return ansenderId;
    }

    public void setAnsenderId(String ansenderId) {
        this.ansenderId = ansenderId;
    }

    private String ansenderId;

    public String getDocumentsName() {
        return documentsName;
    }

    public void setDocumentsName(String documentsName) {
        this.documentsName = documentsName;
    }

    public byte[] getDateinhalt() {
        return dateinhalt;
    }

    public void setDateinhalt(byte[] dateinhalt) {
        this.dateinhalt = dateinhalt;
    }

    public Date getDocumentsDatum() {
        return documentsDatum;
    }

    public void setDocumentsDatum(Date documentsDatum) {
        this.documentsDatum = documentsDatum;
    }
}
