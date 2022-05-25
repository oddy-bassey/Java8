package LambdaAndFunctionalInterface.predicate_in_objects;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployerRepository {

    public static List<Employee> filterEmployees(List<Employee> data, Predicate<Employee> predicate){

        return data.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
