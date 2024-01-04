package behavioral_patterns.interpreter.expression;

import behavioral_patterns.interpreter.Context;
import behavioral_patterns.interpreter.Expression;
import behavioral_patterns.interpreter.table.Row;

import java.util.List;

public class From implements Expression {
    private Where where;

    public From(Where where) {
        this.where = where;
    }

    @Override
    public List<Row> interpret(Context context) {
        return where.interpret(context);
    }
}
