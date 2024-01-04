package behavioral_patterns.interpreter;

import behavioral_patterns.interpreter.table.Row;

import java.util.List;

public interface Expression {
    List<Row> interpret(Context context);
}
