package functionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Functions {
    public static void main(String [] args){
        //Function
        System.out.println(incrementByOneFunction.apply(1));
        System.out.println(multiplyBy10.apply(5));
        System.out.println(addByOneAndThenMultiply.apply(10));

        //BiFunction takes 2 arguments and produces 1 result
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(1, 5));
    }
    //declarative
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;
    //adding andThen
    static Function<Integer, Integer> addByOneAndThenMultiply = incrementByOneFunction.andThen(multiplyBy10);

    //adding BiFunction
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction = (numberToIncrementByOne, numberToMultiplyBy) ->
            (numberToIncrementByOne + 1) * numberToMultiplyBy;


    //imperative
    public static int increment(int num){
        return num + 1;
    }
}
