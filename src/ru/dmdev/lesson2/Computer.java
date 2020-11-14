package ru.dmdev.lesson2;

public class Computer {
    int ssd = 500;
    int ram = 1024;

    void load() {
        System.out.println("Я загрузился");
        printState ();
    }

    void printState () {
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);

    }
}
