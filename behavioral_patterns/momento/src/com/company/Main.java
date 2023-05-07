package behavioral_patterns.momento.src.com.company;

public class Main {

    public static void main(String[] args) {
        var textEditor = new TextEditor();
        var text1 = "abcd";
        for (int i = 0; i < text1.length(); i++) {
            textEditor.write(text1.charAt(i));
        }
        textEditor.save();

        var text2 = "\n123";
        for (int i = 0; i < text2.length(); i++) {
            textEditor.write(text2.charAt(i));
        }
        textEditor.save();

        var text3 = "\nqgjg;d";
        for (int i = 0; i < text3.length(); i++) {
            textEditor.write(text3.charAt(i));
        }

        textEditor.restore();
        textEditor.restore();
        System.out.println(textEditor.getText());
        /*var s = "abcd";
        var s2 = s;
        s += 'e';
        System.out.println(s2);*/
    }
}
