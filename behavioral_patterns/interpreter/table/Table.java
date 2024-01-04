package behavioral_patterns.interpreter.table;

import behavioral_patterns.interpreter.Parser;

import java.util.*;
import java.util.stream.Collectors;

public class Table {
    private List<String> columnNames = new ArrayList<>();
    private List<Row> rows = new ArrayList<>();

    public Table() {};

    public Table(List<String> columnNames, List<Row> rows) {
        this.columnNames = columnNames;
        this.rows = rows;
    }

    public List<Row> getColumnsByQuery(String query) {
        if (query.equals("*")) {
            return rows;
        }

        var columns = new Parser(query).splitByComa();
        return getColumn(columns);
    }

    private List<Row> getColumn(List<String> columns) {
        return rows.stream().map(it -> new Row(it.getCells(columns))).collect(Collectors.toList());
    }
}
