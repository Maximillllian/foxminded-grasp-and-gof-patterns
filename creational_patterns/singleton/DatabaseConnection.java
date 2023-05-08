package creational_patterns.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class DatabaseConnection {
    private static final Integer MAX_CONNECTION_INSTANCES = 10;
    private static List<DatabaseConnection> connections = new ArrayList<>();


    static {
        IntStream.range(1, MAX_CONNECTION_INSTANCES).forEachOrdered(n -> {
            connections.add(new DatabaseConnection());
        });
    }

    public static DatabaseConnection getInstance() {
        return connections.get(0);
    }

    public static List<DatabaseConnection> getConnections() {
        return connections;
    }
}
