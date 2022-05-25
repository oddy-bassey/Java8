package LambdaAndFunctionalInterface.predicate_in_objects;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeMain {

    public static void main(String[] args){
        Employee e1 = new Employee(1, "Ravi", "March", "2011");
        Employee e2 = new Employee(1, "John", "January", "2001");
        Employee e3 = new Employee(1, "Hop", "April", "2009");
        Employee e4 = new Employee(1, "Chad", "May", "2015");

        List<Employee> list = Arrays.asList(e1, e2, e3, e4);
        List<Employee> result = EmployerRepository.filterEmployees(list, isNewJoiner());
        System.out.println(result);

    }

    public static Predicate<Employee> isNewJoiner(){
        return employee -> employee.getMonth().equalsIgnoreCase("April");
    }
}
