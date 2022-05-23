package lambdaExpression.example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortingCollection {

    public static void main(String[] args){

        ArrayList<Integer> data = new ArrayList<>(Arrays.asList(10, 20, 40, 30, 9));

        // Sorting before Java8
//        System.out.println("Before Java8 (unsorted data) "+data);
//        Collections.sort(data, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer num1, Integer num2) {
//                return num1-num2;
//            }
//        });
//        System.out.println("(sorted data) "+data);

        // Sorting after Java8 (using lambda)
        System.out.println("After Java8 (unsorted data) "+data);
        Collections.sort(data, (num1, num2) -> (num1>num2)? 1 : (num1<num2)? -1 : 0);

        // or Collections.sort(data, (num1, num2) -> num1.compareTo(num2));

        System.out.println("(sorted data) "+data);
    }
}
