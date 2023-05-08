package structural_patterns.adapter.deprecated;

import structural_patterns.adapter.deprecated.entities.DocumentInfo;

import java.util.List;

public interface EdiProvider {
    void SendDocument(DocumentInfo documentInfo);
    List<DocumentInfo> GetDocuments(int receiverId, int limit);
}