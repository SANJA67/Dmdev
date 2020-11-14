package ru.dmdev.lesson1;

public class TestExample {
    public static void main(String[] args) {
        int value = 10;
        int[] values = {value, 1000, 980, 200, 50};
        printArrey(values);
    }

    private static void printArrey(int[] values) {
        for (int  value : values)
        System.out.println(value);
    }
}
