package ru.dmdev.lesson3.конструктор;

public class Computer {
    int ssd = 500;
    int ram = 1024;

    public Computer() {
    }

    public Computer(int newSsd) {
        this.ssd = newSsd;
    }

    public Computer(int newSsd, int newRam) {
        this.ssd = newSsd;
        this.ram = newRam;
    }

    void load() {
        System.out.println("Я загрузился");
        printState ();
    }

    void printState () {
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);

    }
}
