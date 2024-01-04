package behavioral_patterns.interpreter.filter;

import behavioral_patterns.interpreter.table.Cell;
import behavioral_patterns.interpreter.table.Row;
import behavioral_patterns.interpreter.expression.Filter;

public class EqualFilter extends Filter {
    public EqualFilter(Cell cell) {
        super(cell);
    }

    @Override
    public boolean checkRow(Row row) {
        return row.getCell(cell.getColumn()).equals(cell);
    }
}
