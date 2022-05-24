package LambdaAndFunctionalInterface.predicate_chaining;

import java.util.function.Predicate;

public class PredicateChaining {

    public static void main(String[] args){
        Predicate<String> p1 = x -> x.startsWith("A");
        Predicate<String> p2 = x -> x.startsWith("B");

        boolean result1 = p1.or(p2).test("ABC");
        System.out.println(result1);

        boolean result2 = p1.or(p2).test("BBC");
        System.out.println(result2);
    }
}
