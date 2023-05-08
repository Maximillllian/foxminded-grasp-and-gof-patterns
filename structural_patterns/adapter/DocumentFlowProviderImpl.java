package structural_patterns.adapter;

import structural_patterns.adapter.external_library.DeutscherDokumentenflussanbieter;

import java.util.List;
import java.util.stream.Collectors;

public class DocumentFlowProviderImpl implements DocumentFlowProvider {
    private DeutscherDokumentenflussanbieter documentFlowProvider;

    public DocumentFlowProviderImpl() {
        this.documentFlowProvider = new DeutscherDokumentenflussanbieter();
    }

    @Override
    public void sendDocuments(String recipientId, String senderId, DocumentInformation documentInformation) {
        documentFlowProvider.dokumentSenden(recipientId, senderId, documentInformation.getOriginalInstance());
    }

    @Override
    public List<DocumentInformation> acceptNewDocuments(String recipientId) {
        var documents = documentFlowProvider.neueDokumenteAkzeptieren(recipientId);
        return documents.stream().map(it -> new DocumentInformationImpl(it)).collect(Collectors.toList());
    }
}
