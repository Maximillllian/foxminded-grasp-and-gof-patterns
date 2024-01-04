package behavioral_patterns.interpreter;

import behavioral_patterns.interpreter.expression.Filter;
import behavioral_patterns.interpreter.table.PersonTableRow;
import behavioral_patterns.interpreter.table.Row;
import behavioral_patterns.interpreter.table.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

public class Context {
    @Getter
    private final static Table table;

    static {
        var columnNames = List.of("name", "age");
        List<Row> data = List.of(
            new PersonTableRow("Max", "23"),
            new PersonTableRow("Kate", "19"),
            new PersonTableRow("John", "24"),
            new PersonTableRow("Jasmine", "25")
        );
        table = new Table(columnNames, data);
    }

    @Setter
    private String columns;
    @Setter
    private List<Filter> filters;

    public Context() {};

    public List<Row> search() {
        return table
            .getColumnsByQuery(columns)
            .stream()
            .filter(it -> filters.stream().allMatch(filter -> filter.checkRow(it)))
            .collect(Collectors.toList());
    }
}
