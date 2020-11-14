package ru.dmdev.lesson7.композицияКлассовТеотрия.космодром;

public class Main {
    public static void main(String[] args) {
        Spaceship spaceship = new Spaceship();
        Pilot pilot = new Pilot("Юрий Гагарин");
        spaceship.putThePilotInARocket(pilot);
        Game game = new Game();
        //game.init();
        game.start();

    }
}