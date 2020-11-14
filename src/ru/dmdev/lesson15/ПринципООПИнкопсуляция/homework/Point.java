package ru.dmdev.lesson15.ПринципООПИнкопсуляция.homework;

public class Point { //prsf + tab

    private int coordinateX;
    private int coordinateY;

    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public double distance(Point point) {
        double power = 2;
        return Math.sqrt((Math.pow(coordinateX - point.coordinateX, power) + Math.pow(coordinateY - point.coordinateY, power)));
    }
}
