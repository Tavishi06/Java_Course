import java.util.function.Function;

public class Functionexample {
    public static void main(String[] args) {

        Function<Integer, Integer> square = (x) -> x * x;
        System.out.println("Square of 5: " + square.apply(5));

        Function<String , String> upper = s -> s.toUpperCase();
        System.out.println("Uppercase of 'hello': " + upper.apply("hello"));

        Function<Integer , Integer> multiply = x -> x * 2;
        Function<Integer , Integer> add = x -> x + 3;

        Function<Integer , Integer> result1 = multiply.andThen(add);
        System.out.println("Result of multiply by 2 and add 3 into 5 { multiply.andThen(add) } : " + result1.apply(5));

         Function<Integer , Integer> result2 = multiply.compose(add);
        System.out.println("Result of multiply by 2 and add 3 into 5 { multiply.compose(add) } : " + result2.apply(5));
    }
}
