package ru.dmdev.lesson15.ПринципООПИнкопсуляция.homework;
// https://gist.github.com/SANJA67/e5e58f03dc39a9969c4719fdf69198e5


public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Point point1 = new Point(10, 10);
        Point point2 = new Point(20, 10);
        Point point3 = new Point(20, 40);
        Point point4 = new Point(10, 40);
        Rectangle rectangle = new Rectangle(point1, point2, point3, point4);

        System.out.println("Периметр четырехугольника: " + rectangle.perimeterCalculation());
        System.out.println("Длина диагонали четырехугольника: " + rectangle.calculationLengthDiagonal());
    }
}
