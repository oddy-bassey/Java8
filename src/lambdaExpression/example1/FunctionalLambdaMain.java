package lambdaExpression.example1;

public class FunctionalLambdaMain {

    public static void main(String[] args){
        // before Java8
        FunctionalLambda fl = new FunctionalLambda() {
            @Override
            public void sum(int a, int b) {
                int sum  = a+b;
                System.out.println(sum);
            }
        };

        fl.sum(20, 29);

        // from java8
        FunctionalLambda fl2 = (a, b) -> System.out.println(a+b);
        fl2.sum(32,65);
    }
}
