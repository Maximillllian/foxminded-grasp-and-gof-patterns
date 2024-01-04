package behavioral_patterns.interpreter;

import java.util.Arrays;
import java.util.List;

public class Parser {
    private String string;

    public Parser(String string) {
        this.string = string;
    }

    public List<String> splitByComa() {
        return splitBy(",( ?)");
    }

    public List<String> splitBy(String regex) {
        return Arrays.stream(string.split(regex)).toList();
    }
}
