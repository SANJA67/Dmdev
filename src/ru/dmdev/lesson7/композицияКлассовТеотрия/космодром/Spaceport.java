package ru.dmdev.lesson7.композицияКлассовТеотрия.космодром;

public class Spaceport {
    MissionControlCenter missionControlCenter;
    Spaceship spaceship;
    String name;

    public Spaceport(String name) {
        this.name = name;
    }

    void initWithSpaceShip(Spaceship spaceship) {
        this.spaceship = spaceship;
        missionControlCenter.currentSpaceShip = spaceship;
    }

    void cleaning() {

    }
}