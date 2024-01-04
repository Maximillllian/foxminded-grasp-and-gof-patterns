package behavioral_patterns.interpreter.table;

import java.util.List;

public class PersonTableRow extends Row {
    public PersonTableRow(String name, String age) {
        this.cells = List.of(new Cell("name", name), new Cell("age", age));
    }
}
