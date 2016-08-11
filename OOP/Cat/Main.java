
public class Main {
    public static void main(String[] args) {
        Paint paint = new Paint();
        //Наш кот
        System.out.println("Our Cat Valentine : ");
        Cat catValentine = new Cat("Valentine", paint.RED, 10, 12);
        System.out.println(catValentine);


        System.out.println("\nHomeless Cat: ");
        Cat catOne = new Cat(paint.DEFAULT, 5, 12);
        System.out.println(catOne);

        //Берем бездомного кота домой и даем ему имя
        //Новый кот стал доманим, соответственно прибавил весу )
        catOne.takeCatToHome("Barbara");
        //Красим нового кота в зеленый цвет для разнообразия
        catOne.setColor(paint.GREEN);
        System.out.println("\nOur new Cat Barbara: ");
        System.out.println(catOne);
    }
}
