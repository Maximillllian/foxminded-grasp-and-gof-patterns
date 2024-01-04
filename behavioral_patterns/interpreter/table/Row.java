package behavioral_patterns.interpreter.table;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class Row {
    protected List<Cell> cells = new ArrayList<>();

    public Row() {};

    public Row(List<Cell> values) {
        this.cells = values;
    }

    public Cell getCell(String column) {
        return cells.stream()
            .filter(it -> it.getColumn().equals(column))
            .findFirst()
            .orElse(null);
    }

    public List<Cell> getCells(List<String> columns) {
        return columns.stream().map(this::getCell).collect(Collectors.toList());
    }

    public String toString() {
        var result = "";

        for (var cell : cells) {
            result += cell.toString() + " ";
        }

        return result;
    }
}
