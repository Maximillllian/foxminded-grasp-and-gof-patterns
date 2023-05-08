package structural_patterns.adapter;

import java.util.List;

public interface DocumentFlowProvider {
    public void sendDocuments(String recipientId, String senderId, DocumentInformation documentInformation);
    public List<DocumentInformation> acceptNewDocuments(String recipientId);
}
