package LambdaAndFunctionalInterface.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample1 {

    public static void main(String[] args){

        List<Integer> data = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        List<Integer> result1 = data.stream()
                .filter(x -> x>=5)
                .collect(Collectors.toList());

        System.out.println(result1);

        // using predicate
        Predicate<Integer> p1 = x -> x>3;
        Predicate<Integer> p2 = x -> x<8;

        List<Integer> result2 = data.stream()
                .filter(p1)
                .collect(Collectors.toList());

        System.out.println(result2);

        List<Integer> result3 = data.stream()
                .filter(p2.and(p1))
                .collect(Collectors.toList());

        System.out.println(result3);
    }
}
