package school.management.system;

import java.util.List;

/**
 * Implement teachers and students
 * using ArrayList
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * New school object
     * @param teachers
     * @param students
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * Return the list of teachers in the school
     * @return
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Add a teacher to school
     * @param teacher
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * Return the list of students in the school
     * @return
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Add a new student to the school
     * @param student
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Return the total money earned by the school
     * @return
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Add the total money earned by school
     * @param MoneyEarned
     */
    public void updateTotalMoneyEarned(int MoneyEarned) {
        this.totalMoneyEarned += MoneyEarned;
    }

    /**
     * Return the total money by school
     * @return
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school
     * which is the salary for teachers
     * @param MoneySpent
     */
    public void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
        this.totalMoneySpent = totalMoneySpent;
    }
}
