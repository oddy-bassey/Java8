package LambdaAndFunctionalInterface.predicate_as_function;

import java.util.Arrays;
import java.util.List;

public class StringProcessorMain {

    public static void main(String[] args){
        List<String> data = Arrays.asList("Raj", "Rado", "Gilly", "Vokud");

        System.out.println(StringProcessor.filter(data, x -> x.startsWith("R")));
        System.out.println(StringProcessor.filter(data, x -> x.startsWith("R") || x.endsWith("d")));
        System.out.println(StringProcessor.filter(data, x -> x.startsWith("G") && x.length() == 5));
    }
}
