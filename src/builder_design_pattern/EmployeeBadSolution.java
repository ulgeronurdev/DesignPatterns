package builder_design_pattern;

// without BuilderDesignPattern
public class EmployeeBadSolution {
    private String firstName;
    private String lastName;
    private int age;
    private String position;
    private double salary;
    public EmployeeBadSolution(String firstName, String lastName, int age, String position,
                               double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    //getter
    //setter
}