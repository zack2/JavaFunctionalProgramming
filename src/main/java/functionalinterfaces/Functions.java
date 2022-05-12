package functionalinterfaces;

import java.util.function.Function;

public class Functions {
    public static void main(String [] args){

        System.out.println(incrementByOneFunction.apply(1));
        System.out.println(multiplyBy10.apply(5));
        System.out.println(addByOneAndThenMultiply.apply(10));
    }
    //declarative
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;
    static Function<Integer, Integer> addByOneAndThenMultiply = incrementByOneFunction.andThen(multiplyBy10);


    //imperative
    public static int increment(int num){
        return num + 1;
    }
}
