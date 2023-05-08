package creational_patterns.singleton;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        var connections = new ArrayList<>();
        IntStream.range(0, 10).forEachOrdered(n -> {
            connections.add(DatabaseConnection.getInstance());
        });
        System.out.println("" + DatabaseConnection.getConnections());
        System.out.println("" + DatabaseConnection.getConnections().size());
    }
}
