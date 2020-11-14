package ru.dmdev.lesson7.композицияКлассовТеотрия.космодром;

public class Game {
    Spaceport spaceport;
    Spaceship spaceship;


    public void init() {
        spaceport = new Spaceport("Baikonur");
        MissionControlCenter missionControlCenter = new MissionControlCenter();
        spaceport.missionControlCenter = missionControlCenter; // todo get-set

        Spaceship spaceship = new Spaceship();
        spaceport.initWithSpaceShip(spaceship);
    }

    public void start() {
        spaceport.missionControlCenter.launch();
    }

    public void putThePilotInARocket(Pilot pilot) {
        spaceship.putThePilotInARocket(pilot);
    }
}