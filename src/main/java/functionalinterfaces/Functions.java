package functionalinterfaces;

import java.util.function.Function;

public class Functions {
    public static void main(String [] args){

        System.out.println(incrementByOneFunction.apply(1));
    }
    //declarative
    static Function<Integer, Integer> incrementByOneFunction = number -> number++;
    //imperative
    public static int increment(int num){
        return num + 1;
    }
}
