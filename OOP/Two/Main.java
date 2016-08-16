package Opp.two;

public class Main {
    public static void main(String[] args) {
        Desk desk = new Desk();

        Triangle triangleOne = new Triangle(new Point(0, 0), new Point(3, 3), new Point(0, 6));
        Triangle triangleTwo = new Triangle(new Point(0, 0), new Point(6, 6), new Point(0, 6));
        Circle circle = new Circle(4);
        Square square = new Square(new Point(0, 0), new Point(0, 4), new Point(4, 4), new Point(4, 0));


        desk.add(triangleOne, 3);
        desk.add(triangleTwo, 1);
        desk.add(circle);
        desk.add(square);

        desk.printAll();

        desk.del(1);
        desk.del(0);

        desk.printAll();


    }
}
