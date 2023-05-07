package com.company;

import com.company.entities.DocumentInfo;
import com.company.entities.Dokumentinformationen;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class EdiProviderProxy implements EdiProvider {

    private DeutscherDokumentenflussanbieter deutscherDokumentenflussanbieter;
    private String companyId;

    public EdiProviderProxy(String companyId) {
        this.companyId = companyId;
        this.deutscherDokumentenflussanbieter = new DeutscherDokumentenflussanbieter();
    }

    @Override
    public void SendDocument(DocumentInfo documentInfo) {
        Dokumentinformationen dokumentinformationen = new Dokumentinformationen();
        dokumentinformationen.setAnsenderId(documentInfo.getSenderId());
        dokumentinformationen.setDateinhalt(documentInfo.getData());
        dokumentinformationen.setDocumentsDatum(documentInfo.getDocumentDate());

        var documentName = documentInfo.getDocumentNumber() + "_" + documentInfo.getDocumentDate();
        dokumentinformationen.setDocumentsName(documentName);
        dokumentinformationen.setEmpfängerId(documentInfo.getReceiverId());
        deutscherDokumentenflussanbieter.documentSenden(documentInfo.getReceiverId(), documentInfo.getSenderId(), dokumentinformationen);
    }

    @Override
    public List<DocumentInfo> GetDocuments(int receiverId, int limit) {
        return deutscherDokumentenflussanbieter.neueDokumenteAkzeptieren(this.companyId)
                .stream()
                .limit(limit)
                .map(x -> new DocumentInfo(
                        x.getDocumentsDatum(),
                        Date.from(
                                LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()),
                        x.getDokumentnummer(),
                        x.getDateinhalt(),
                        x.getAnsenderId(),
                        this.companyId))
                .collect(Collectors.toList());
    }
}
