package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Emma = new Teacher(1,"Emma",3000);
        Teacher Sean = new Teacher(2, "Sean", 3000);
        Teacher Mike = new Teacher(3, "Mike", 3000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Emma);
        teacherList.add(Sean);
        teacherList.add(Mike);

        Student Alice = new Student(1, "Alice", 90);
        Student Alex = new Student(2, "Alex", 80);
        Student James = new Student(3, "James", 100);

        List<Student> studentList = new ArrayList<>();

        studentList.add(Alice);
        studentList.add(Alex);
        studentList.add(James);

        School UVIC = new School(teacherList, studentList);

        System.out.println("UVIC has earned: " + UVIC.getTotalMoneyEarned());
    }
}
