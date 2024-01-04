package behavioral_patterns.interpreter;

import behavioral_patterns.interpreter.expression.From;
import behavioral_patterns.interpreter.expression.SearchExpression;
import behavioral_patterns.interpreter.expression.Select;
import behavioral_patterns.interpreter.expression.Where;

public class Main {
    public static void main(String[] args) {
        var context = new Context();
//        TODO: еще осталось много багов с вводом, мне лень править
        var expression = new Select("*", new From(new Where("age=24", new SearchExpression())));
        System.out.println(expression.interpret(context));
    }
}
