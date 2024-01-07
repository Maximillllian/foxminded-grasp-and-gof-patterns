package behavioral_patterns.memento.deprecated.src.com.company;

public interface ITextEditor {
    void save();
    void restore();
    void write(char c);
    String getText();
}
