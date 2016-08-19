package Opp.three;

import java.util.Arrays;

public class Group {
    private String name;
    private static Student[] group = new Student[10];

    public Group() {
    }

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        try {
            for (int i = 0; i < group.length && isFullGroup(); i++) {
                if (group[i] == null) {
                    group[i] = student;
                    break;
                }
            }
        } catch (GroupException e) {
            System.out.println(e);
        }
    }


    public void deleteStudent(String secondName) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                continue;
            }
            if (group[i].getSecondName().equals(secondName)) {
                group[i] = null;
            }
        }
    }

    public void searchStudent(String secondName) {
        boolean temp = false;
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                continue;
            }
            if (group[i].getSecondName().equals(secondName)) {
                System.out.println(group[i]);
                temp = true;
            }
        }
        if (!temp) {
            System.out.println("No such student " + secondName + " in group " + this.name);
        }
    }

    private boolean isFullGroup() throws GroupException {
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                return true;
            }
        }
        throw new GroupException("Group is full!");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        try {
            //Override Comparator with lambda for sorting array by SecondName
            Arrays.sort(group, (o1, o2) -> o1.getSecondName().compareTo(o2.getSecondName()));
        } catch (NullPointerException ignored) {
        }
        for (Student student : group) {
            if (student == null) continue;
            builder.append(student).append("\n");
        }
        return builder.toString();
    }
}
