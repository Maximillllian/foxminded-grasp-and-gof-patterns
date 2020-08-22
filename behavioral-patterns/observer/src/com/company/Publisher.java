package com.company;

public interface Publisher {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
}
