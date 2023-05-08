package structural_patterns.adapter;

public class Main {
    public static void main(String[] args) {
        var documentInformation = new DocumentInformationImpl();
        documentInformation.setDocumentsName("my-name");

        var recipientId = "666";
        var senderId = "777";

        var documentFlowProvider = new DocumentFlowProviderImpl();
        documentFlowProvider.sendDocuments(recipientId, senderId, documentInformation);
        documentFlowProvider.acceptNewDocuments(recipientId);
    }
}
