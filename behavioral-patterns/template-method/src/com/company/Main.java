package com.company;

public class Main {

    public static void main(String[] args) {
        DataFileWriter fileWriter = new DateTimeFileWriter();
        fileWriter.write("./test.txt");
    }
}
