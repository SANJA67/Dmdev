package ru.dmdev.lesson15.ПринципООПИнкопсуляция.homework;
//- Высчитывающий площадь прямоугольника
//- Высчитывающий длину диагонали
public class Rectangle {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Rectangle(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    public double perimeterCalculation () {
        return point1.distance(point2) + point2.distance(point3) + point3.distance(point4) + point4.distance(point1);

    }

    public double calculationLengthDiagonal() {
        return point1.distance(point3);
    }


}
