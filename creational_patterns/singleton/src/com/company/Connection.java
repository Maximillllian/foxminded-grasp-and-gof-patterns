package creational_patterns.singleton.src.com.company;

import java.util.LinkedList;
import java.util.List;

public class Connection {
    private static final int MAX_CONNECTION_COUNT = 10;
    private static final List<Connection> connections = new LinkedList<>();

    static {
        for (int i = 0; i < MAX_CONNECTION_COUNT; i++) {
            connections.add(new Connection());
        }
    }

    public static Connection getInstance () {

        Connection chosenConnection = null;

        //в коде намеренно не учитывается возможный конкурентный доступ к ресурсу
        for (var conn : connections) {
            if (!conn.getUsed()) {
                chosenConnection = conn;
            }
        }
        if (chosenConnection != null) {
            chosenConnection.setUsed(true);
        }

        return chosenConnection;
    }

    private Boolean isUsed;

    private Connection() {
        isUsed = false;
    }

    private void setUsed (Boolean used){
        isUsed = used;
    }


    public void free () {
        setUsed(false);
    }

    public Boolean getUsed () {
        return isUsed;
    }
}
