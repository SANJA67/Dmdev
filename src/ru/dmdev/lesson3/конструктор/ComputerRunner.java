package ru.dmdev.lesson3.конструктор;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer computer1 = new Computer(1000);
        Computer computer2 = new Computer(1000, 3072);

        computer.load();
        computer1.load();
        computer2.load();
        //System.out.println("Ram: " + computer.ram);
        //System.out.println("Ssd: " + computer.ssd);
    }
}
