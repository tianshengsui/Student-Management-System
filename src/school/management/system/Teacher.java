package school.management.system;

/**
 * Responsive for tracking teachers
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;

    /**
     * Create a new Teacher object
     * @param id    id for the teacher
     * @param name  name of the teacher
     * @param salary salary for the teacher
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
}
