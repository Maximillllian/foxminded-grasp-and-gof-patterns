package behavioral_patterns.strategy.src.com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var sorter = new Sorter<Integer>();
        var values = new ArrayList<Integer>();
        values.add(5);
        values.add(3);
        values.add(2);
        values.add(6);
        values.add(2);
        values.add(7);
        values.add(8);
        values.add(9);
        values.add(0);
        values.add(4);
        values.add(3);
        values.add(5);
        sorter.sort(values);

        for (var value : values) {
            System.out.println(value);
        }
    }
}
