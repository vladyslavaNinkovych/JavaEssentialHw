package hw6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<>();
        Teacher t1 = new Teacher("teacher1", "Geography");
        Teacher t2 = new Teacher("teacher2", "Biology");
        Teacher t3 = new Teacher("teacher3", "Chemistry");

        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);

        System.out.println(teachers);
        System.out.println("Index of the best teacher:" + teachers.indexOf(t2));
        System.out.println("Index of the worst teacher:" + teachers.indexOf(t3));

        for (Teacher teacher : teachers) {
            System.out.println(teacher.toString());
        }

        for (Teacher teacher : teachers) {
            System.out.println(teacher.getName() + " " + teacher.getSubject());
        }
    }
}
