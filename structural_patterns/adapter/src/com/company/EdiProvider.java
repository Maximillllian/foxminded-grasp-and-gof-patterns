package structural_patterns.adapter.src.com.company;

import structural_patterns.adapter.src.com.company.entities.DocumentInfo;

import java.util.List;

public interface EdiProvider {
    void SendDocument(DocumentInfo documentInfo);
    List<DocumentInfo> GetDocuments(int receiverId, int limit);
}