package Opp.three;

public class Human {

    private String name;
    private String secondName;
    private boolean sex;
    private double weight;
    private int age;

    public Human() {
    }


    public Human(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public Human(String name, String secondName, boolean sex, double weight, int age) {

        this.name = name;
        this.secondName = secondName;
        this.sex = sex;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info(){
        return "Name - " + this.getName() + " "  + this.getSecondName() + " | ";
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", sex=" + sex +
                ", weight=" + weight +
                ", age=" + age;
    }


}
