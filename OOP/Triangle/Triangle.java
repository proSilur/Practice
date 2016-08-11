package OppOne;

public class Triangle {
    private double partA;
    private double partB;
    private double partC;


    public Triangle() {
    }

    public Triangle(double partA, double partB, double partC) {
        this.partA = partA;
        this.partB = partB;
        this.partC = partC;
    }

    public double getPartA() {
        return partA;
    }

    public void setPartA(double partA) {
        this.partA = partA;
    }

    public double getPartB() {
        return partB;
    }

    public void setPartB(double partB) {
        this.partB = partB;
    }

    public double getPartC() {
        return partC;
    }

    public void setPartC(double partC) {
        this.partC = partC;
    }

    public boolean isTriangleExist() {
        return ((partA + partB > partC &&
                partA + partC > partB &&
                partB + partC > partA) &&
                (partA > 0 && partB > 0 && partC > 0));
    }

    public void printTriangleArea() {
        if (isTriangleExist()) {
            double semiPerimeter = (partA + partB + partC) / 2;
            System.out.println(Math.sqrt(semiPerimeter * (semiPerimeter - partA) * (semiPerimeter - partB) * (semiPerimeter - partC)));
        } else System.out.println("This triangle does not exist");
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "part A = " + partA + "km" +
                ", part B = " + partB + "km" +
                ", part C = " + partC + "km" +
                '}';
    }
}
