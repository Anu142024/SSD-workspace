package lap10;

public class Employee {

    private String empID;
    private String name;
    private int salary;

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String empID, String name, int salary) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }

}
