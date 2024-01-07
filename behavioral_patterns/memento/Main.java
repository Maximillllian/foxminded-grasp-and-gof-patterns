package behavioral_patterns.memento;

public class Main {
    public static void main(String[] args) {
        var caretaker = new Caretaker();
        var editor = new TextEditorImpl(caretaker);

        editor.createDocument("new document", "radio ga ga");
        editor.save("1");
        editor.createDocument("new-document 1", "call of ktulhu");
        editor.save("2");

        System.out.println(editor.getDocument());

        editor.restoreDocument("1");
        System.out.println(editor.getDocument());
        editor.restoreDocument("2");
        System.out.println(editor.getDocument());
    }
}
