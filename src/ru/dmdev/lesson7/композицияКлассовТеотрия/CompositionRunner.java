package ru.dmdev.lesson7.композицияКлассовТеотрия;

public class CompositionRunner {

    public static void main(String[] args) {
        Ram ram = new Ram(1000);
        Ssd ssd = new Ssd(500);
        Computer computer = new Computer(ram, ssd);
        computer.printState();
    }
}
