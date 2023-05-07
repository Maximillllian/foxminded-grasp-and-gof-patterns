package behavioral_patterns.momento.src.com.company;

public interface ITextEditor {
    void save();
    void restore();
    void write(char c);
    String getText();
}
