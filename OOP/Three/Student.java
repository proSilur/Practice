package Opp.three;


public class Student extends Human {

    private String faculty;
    private String favouriteSubject;

    public Student() {
    }

    public Student(String name, String secondName, String faculty, String favouriteSubject) {
        super(name, secondName);
        this.faculty = faculty;
        this.favouriteSubject = favouriteSubject;
    }

    public Student(String name, String secondName) {
        super(name, secondName);
    }

    public Student(String name, String secondName, boolean sex, double weight, int age, String favouriteSubject, String faculty) {
        super(name, secondName, sex, weight, age);
        this.favouriteSubject = favouriteSubject;
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFavouriteSubject() {
        return favouriteSubject;
    }

    public void setFavouriteSubject(String favouriteSubject) {
        this.favouriteSubject = favouriteSubject;
    }

    @Override
    public String toString() {
        return (faculty != null) ? super.info() + "Faculty - " + faculty + " | Favourite Subject - " + favouriteSubject : super.toString();
    }
}
