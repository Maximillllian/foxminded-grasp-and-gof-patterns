package behavioral_patterns.interpreter.expression;

import behavioral_patterns.interpreter.table.Cell;
import behavioral_patterns.interpreter.table.Row;

public abstract class Filter {
    protected final Cell cell;

    public Filter(Cell cell) {
        this.cell = cell;
    }

    public abstract boolean checkRow(Row row);
}
