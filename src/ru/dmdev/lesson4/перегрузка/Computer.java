package ru.dmdev.lesson4.перегрузка;

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

    void load(boolean open) {
        System.out.println("Я загрузился");
        if (open){
            System.out.println("Открыта крышка");
        }
        printState ();
    }

    void printState () {
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);

    }
}
