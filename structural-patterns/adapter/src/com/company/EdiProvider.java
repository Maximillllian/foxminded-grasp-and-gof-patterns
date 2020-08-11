package com.company;

import com.company.entities.DocumentInfo;

import java.util.List;

public interface EdiProvider {
    void SendDocument(DocumentInfo documentInfo);
    List<DocumentInfo> GetDocuments(int receiverId, int limit);
}