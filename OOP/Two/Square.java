package Opp.two;

public class Square extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Square() {
    }

    public Square(Point a, Point b, Point c, Point d) {

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    double getPerimeter() {
        return Point.distance(a, b) * 4;
    }

    @Override
    double getArea() {
        return Math.pow(Point.distance(a, b), 2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
