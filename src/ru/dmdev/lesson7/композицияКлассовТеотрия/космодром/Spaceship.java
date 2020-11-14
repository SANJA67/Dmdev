package ru.dmdev.lesson7.композицияКлассовТеотрия.космодром;

public class Spaceship {
    int speed;
    String name;
    Pilot pilot;
    public int size;
    public double id;

    void launch() {
        System.out.println("take off");
    }

    void landing() {

    }

    void putThePilotInARocket(Pilot pilot) {
        System.out.println("В коробле пилот: " + pilot.name);
    }


}