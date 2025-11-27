package lap10;

import java.util.*;

public class Driver {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("c101","Anu", 100));
        employees.add(new Employee("c102","James", 80));
        employees.add(new Employee("c103","Smith", 90));

        employees.stream().filter(emp -> emp.getSalary() > 500).forEach(System.out :: println);

        Optional<Employee> emp = employees.stream().max((e1, e2) -> Integer.compare(e1.getSalary(), e2.getSalary()));

    }
}
