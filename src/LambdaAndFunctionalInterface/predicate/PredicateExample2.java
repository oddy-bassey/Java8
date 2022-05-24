package LambdaAndFunctionalInterface.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample2 {

    public static void main(String[] args){

        List<String> data = Arrays.asList("Ravi", "Rajesh", "Sam", "Gilly");

        List<String> result1 = data.stream()
                    .filter(x -> x.startsWith("R") || x.startsWith("G"))
                    .collect(Collectors.toList());

        System.out.println(result1);

        // using predicate
        Predicate<String> p1 = x -> x.startsWith("R");
        Predicate<String> p2 = x -> x.startsWith("G");

        List<String> result2 = data.stream()
                .filter(p1.or(p2))
                .collect(Collectors.toList());

        System.out.println(result2);

        List<String> result3 = data.stream()
                .filter(p1.negate())
                .collect(Collectors.toList());

        System.out.println(result3);
    }
}
