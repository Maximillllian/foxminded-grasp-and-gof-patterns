package behavioral_patterns.memento;

import lombok.Data;

import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Caretaker {
    private final Map<String, DocumentMemento> history = new HashMap<>();

    public void createSnapshot(Document document, String version) {
        history.put(version, new DocumentMemento(document));
    }

    public Document restoreSnapshot(String version) {
        var memento = history.get(version);
        if (memento == null) {
            return null;
        }
        return memento.toDocument();
    }

    @Data
    private static class DocumentMemento {
        private String name;
        private String text;
        private Instant dateCreated;

        public DocumentMemento(Document document) {
            this.name = document.getName();;
            this.text = document.getText();
            this.dateCreated = document.getDateCreated();
        }

        public Document toDocument() {
            var document = new Document(name, text);
            document.setDateCreated(dateCreated);
            return document;
        }
    }
}
