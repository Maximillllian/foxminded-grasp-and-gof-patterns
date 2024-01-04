package behavioral_patterns.interpreter.expression;

import behavioral_patterns.interpreter.*;
import behavioral_patterns.interpreter.filter.EqualFilter;
import behavioral_patterns.interpreter.table.Cell;
import behavioral_patterns.interpreter.table.Row;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Where implements Expression {
    private String query;
    private SearchExpression search;

    public Where(String query, SearchExpression search) {
        this.search = search;
        this.query = query;
    }

    @Override
    public List<Row> interpret(Context context) {
        context.setFilters(parseFilters());
        return search.interpret(context);
    }

    private List<Filter> parseFilters() {
        var queries = new Parser(query).splitByComa();
        if (queries.isEmpty()) {
            return Collections.emptyList();
        }

        var filters = queries.stream()
            .map(this::gerFilter)
            .filter(Objects::nonNull)
            .toList();

        return filters;
    }

    private Filter gerFilter(String query) {
        if (query.contains("=")) {
            var values = new Parser(query).splitBy("=");
            var column = values.get(0);
            var value = values.get(1);
            return new EqualFilter(new Cell(column, value));
        }

        return null;
    }
}
