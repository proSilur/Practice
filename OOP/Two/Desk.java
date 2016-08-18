package Opp.two;

public class Desk {
    private static Shape[] shapes = new Shape[4];
    private static int counter = 0;

    public Desk() {
    }

    public void add(Shape shape) {
        if (counter >= 4) {
            System.out.println("There is no empty place on board");
            return;
        }
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] == null) {
                shapes[i] = shape;
                counter++;
                break;
            }
        }
    }

    public void add(Shape shape, int position) {
        if (counter >= 4) {
            System.out.println("There is no empty place on board");
            return;
        }
        if (position >= shapes.length) {
            System.out.println("Wrong position");
            return;
        }
        if (shapes[position] == null) {
            shapes[position] = shape;
            counter++;
        } else System.out.println("This place already taken!");
    }

    public void del(int position) {
        if (position >= shapes.length) {
            System.out.println("Wrong position");
        }
        if (shapes[position] != null) {
            shapes[position] = null;
            counter--;
        } else System.out.println("This place already clear!");
    }

    public void printAll() {
        String temp = (counter == 4) ? "\nAll places has been taken\n" :
                ("\nThere is " + (4 - counter) + " Empty places available." + " { " + availablePlaces(shapes) + "}\n");
        double area = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                area += shapes[i].getArea();
            }
        }
        System.out.println(toString() + "All area = " + area + temp);
    }

    private String availablePlaces(Shape[] shapes) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] == null) {
                builder.append(i).append(" ");
            }
        }
        return String.valueOf(builder);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Shape shape : shapes) {
            if (shape == null) {
                continue;
            }
            builder.append(shape).append("\n");
        }
        return String.valueOf(builder);
    }
}
