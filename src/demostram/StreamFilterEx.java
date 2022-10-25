package demostram;

import model.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFilterEx {
    public static void main(String[] args) {
        List<Employee> empList=new ArrayList<>();
        empList.add(new Employee("Nataraja G", "Accounts", 8000));
        empList.add(new Employee("Nagesh Y", "Admin", 15000));
        empList.add(new Employee("Vasu V", "Security", 2500));
        empList.add(new Employee("Amar", "Entertinment", 12500));
        // find employees whose salaries are above 10000
//        empList.stream().filter(emp->emp.getSalary()>10000).forEach(System.out::println);
//        empList.stream().filter(employee -> employee.getName()=="Nataraja G").forEach(System.out::println);
        //optional
        Optional<Employee> maxsalary=empList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Empl may sal: "+(maxsalary.isPresent()?maxsalary.get():"Not apllicable "));

    }
}
