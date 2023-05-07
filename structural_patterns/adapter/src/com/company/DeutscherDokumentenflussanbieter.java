package structural_patterns.adapter.src.com.company;

import structural_patterns.adapter.src.com.company.entities.Dokumentinformationen;

import java.util.List;

public class DeutscherDokumentenflussanbieter {

    public void documentSenden(String empfängerId, String ansenderId, Dokumentinformationen dokumentinformationen) {

    }

    public List<Dokumentinformationen> neueDokumenteAkzeptieren(String empfängerId) {
        return List.of();
    }
}
