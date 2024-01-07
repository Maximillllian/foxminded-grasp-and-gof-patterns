package behavioral_patterns.memento.deprecated.src.com.company;

import java.util.Stack;

public class TextEditor implements ITextEditor {

    private String currentText;
    private Stack<Momento> snapshots;

    public TextEditor()
    {
        currentText = "";
        snapshots = new Stack<>();
    }

    @Override
    public void save() {
        snapshots.add(new Momento(currentText));
    }

    @Override
    public void restore() {
        try {
            currentText = snapshots.pop().getText();
        } finally {

        }
    }

    @Override
    public void write(char c) {
        currentText += c;
    }

    @Override
    public String getText() {
        return currentText;
    }

    private static class Momento
    {
        private final String text;

        public Momento(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
}
