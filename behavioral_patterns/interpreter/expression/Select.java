package behavioral_patterns.interpreter.expression;

import behavioral_patterns.interpreter.Context;
import behavioral_patterns.interpreter.Expression;
import behavioral_patterns.interpreter.table.Row;

import java.util.List;

public class Select implements Expression {
    private String columns;
    private From from;

    public Select(String columns, From from) {
        this.columns = columns;
        this.from = from;
    };

    @Override
    public List<Row> interpret(Context context) {
        context.setColumns(columns);
        return from.interpret(context);
    }
}
