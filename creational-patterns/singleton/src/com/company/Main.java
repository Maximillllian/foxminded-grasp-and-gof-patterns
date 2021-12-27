package com.company;

public class Main {

    public static void main(String[] args) {
        int requestsNumber = 11;
        var connections = new Connection[requestsNumber];
        for (int i = 0; i < requestsNumber; i++) {
            connections[i] = Connection.getInstance();
        }
        //первые 10 соединений разные
        System.out.println(connections[requestsNumber - 1] == connections[requestsNumber - 2]);
        //далее соединения совпадают (11-й запрос дает нулевое соединение, 12-ый - первое и т.д.)
        System.out.println(connections[requestsNumber - 1] == connections[0]);
    }
}
