
public class Cat {

    private String name;
    private String paint;
    private int age;
    private int weight;

    public Cat() {
    }
    
    //Бездомный Кот без имени
    public Cat(String paint, int age, int weight) {
        this.paint = paint;
        this.age = age;
        this.weight = weight;
    }

    //Домашний кот с именем
    public Cat(String name, String paint, int age, int weight) {
        this.name = name;
        this.paint = paint;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return paint;
    }

    public void setColor(String paint) {
        if (this.name == null) {
            System.out.println("\nWe can not paint a homeless cat!\n");
        } else this.paint = paint;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

   

    //Взять кота домой и дать ему имя
    public void takeCatToHome(String name) {
        if (this.name != null) {
            System.out.println("This cat already yours");
        } else {
            setName(name);
            setWeight(weight + 10);
        }
    }


    private String homeCat() {
        return "───────────────────────────────────────\n" +
                "───▐▀▄───────▄▀▌───▄▄▄▄▄▄▄─────────────\n" +
                "───▌▒▒▀▄▄▄▄▄▀▒▒▐▄▀▀▒██▒██▒▀▀▄──────────\n" +
                "──▐▒▒▒▒▀▒▀▒▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▀▄────────\n" +
                "──▌▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▄▒▒▒▒▒▒▒▒▒▒▒▒▀▄──────\n" +
                "▀█▒▒▒█▌▒▒█▒▒▐█▒▒▒▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌─────\n" +
                "▀▌▒▒▒▒▒▒▀▒▀▒▒▒▒▒▒▀▀▒▒▒▒▒▒▒▒▒▒▒▒▒▒▐───▄▄\n" +
                "▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌▄█▒█\n" +
                "▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒█▀─\n" +
                "▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▀───\n" +
                "▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌────\n" +
                "─▌▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▐─────\n" +
                "─▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌─────\n" +
                "──▌▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▐──────\n" +
                "──▐▄▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▄▌──────\n" +
                "────▀▄▄▀▀▀▀▀▄▄▀▀▀▀▀▀▀▄▄▀▀▀▀▀▄▄▀────────";
    }

	//Выглядит тут печально конечно, но в консоли норм
    private String homelessCat() {
        return "      ( \\\n" +
                "       \\ \\\n" +
                "       / /                |\\\\\n" +
                "      / /     .-`````-.   / ^`-.\n" +
                "      \\ \\    /         \\_/  {|} `o\n" +
                "       \\ \\  /   .---.   \\\\ _  ,--'\n" +
                "        \\ \\/   /     \\,  \\( `^^^\n" +
                "         \\   \\/\\      (\\  )\n" +
                "          \\   ) \\     ) \\ \\\n" +
                "           ) /__ \\__  ) (\\ \\___\n" +
                "          (___)))__))(__))(__)))";
    }
    
    @Override
    public String toString() {
        String cat = (name != null) ? homeCat() : homelessCat();
        return this.paint + "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}' + "\n" + cat;
    }
}
