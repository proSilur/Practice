package Opp.three;


public class Main {
    public static void main(String[] args) {
        Group group = new Group("Programmers");

        group.addStudent(new Student("NameX", "SecondNameX", "Informatics", "Java"));
        group.addStudent(new Student("NameY", "SecondNameY", "Informatics", "C#"));
        group.addStudent(new Student("NameZ", "SecondNameZ", "Informatics", "Python"));
        group.addStudent(new Student("NameA", "SecondNameA", "Informatics", "C++"));
        group.addStudent(new Student("NameC", "SecondNameC", "Informatics", "C"));
        group.addStudent(new Student("NameB", "SecondNameB", "Informatics", "JavaScript"));
        group.addStudent(new Student("NameG", "SecondNameG", "Informatics", "Objective-C"));
        group.addStudent(new Student("NameF", "SecondNameF", "Informatics", "Ruby"));
        group.addStudent(new Student("NameL", "SecondNameL", "Informatics", "Perl"));
        group.addStudent(new Student("NameM", "SecondNameM", "Informatics", "Swift"));

        System.out.println(group.toString());


        //try to add 11 student
//        group.addStudent(new Student("NameU", "SecondNameU", "Informatics", "Scala"));
//        System.out.println(group.toString());


        group.deleteStudent("SecondNameC");
        group.deleteStudent("SecondNameB");
        group.deleteStudent("SecondNameA");
        System.out.println(group.toString());

        group.searchStudent("SecondNameC");
        group.searchStudent("SecondNameL");
        group.searchStudent("SecondNameM");
    }
}
