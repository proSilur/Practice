package OppOne;

/**
 * Created by George on 11.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        Triangle triangleOne = new Triangle(3,4,0);
        Triangle triangleTwo = new Triangle(3,4,5);


        triangleOne.printTriangleArea();
        triangleTwo.printTriangleArea();
    }
}
