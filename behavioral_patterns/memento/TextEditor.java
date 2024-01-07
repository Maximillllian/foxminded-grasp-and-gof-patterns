package behavioral_patterns.memento;

public interface TextEditor {
    void save(String version);
    void restoreDocument(String version);
}
