package behavioral_patterns.memento;

import lombok.Getter;

import java.time.Instant;

public class TextEditorImpl implements TextEditor {
    @Getter
    private Document document;
    private final Caretaker caretaker;

    public TextEditorImpl(Caretaker caretaker) {
        this.caretaker = caretaker;
    }

    public void createDocument(String name, String text) {
        var document = new Document(name, text);
        document.setDateCreated(Instant.now());
        this.document = document;
    }

    @Override
    public void save(String version) {
        caretaker.createSnapshot(document, version);
    }

    @Override
    public void restoreDocument(String version) {
        this.document = caretaker.restoreSnapshot(version);
    }
}
