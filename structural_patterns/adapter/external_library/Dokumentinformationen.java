package structural_patterns.adapter.external_library;

import java.util.Date;

public class Dokumentinformationen {

    private String dokumentsName;
    private byte[] dateinhalt;
    private Date dokumentsDatum;
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

    public String getDokumentsName() {
        return dokumentsName;
    }

    public void setDokumentsName(String dokumentsName) {
        this.dokumentsName = dokumentsName;
    }

    public byte[] getDateinhalt() {
        return dateinhalt;
    }

    public void setDateinhalt(byte[] dateinhalt) {
        this.dateinhalt = dateinhalt;
    }

    public Date getDokumentsDatum() {
        return dokumentsDatum;
    }

    public void setDokumentsDatum(Date dokumentsDatum) {
        this.dokumentsDatum = dokumentsDatum;
    }
}
