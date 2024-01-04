package behavioral_patterns.interpreter.expression;

import behavioral_patterns.interpreter.Context;
import behavioral_patterns.interpreter.Expression;
import behavioral_patterns.interpreter.table.Row;

import java.util.List;

public class SearchExpression implements Expression {
    public SearchExpression() {};

    @Override
    public List<Row> interpret(Context context) {
        return context.search();
    }
}
