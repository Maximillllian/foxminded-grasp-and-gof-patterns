package behavioral_patterns.interpreter.table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(of = {"value"})
public class Cell {
    private String column;
    private String value;

    public Cell(String column, String value) {
        this.column = column;
        this.value = value;
    }

    public boolean valueEquals(String value) {
        return this.value.equals(value);
    }

    public String toString() {
        return String.format("%s", value);
    }
}
