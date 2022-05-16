package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        //normal way
        Function<String, String> upperCaseName = name -> name.toUpperCase();
        //with method reference
        Function<String, String> upperCaseNameWithMethodRef = String::toUpperCase;

        System.out.println(upperCaseWithBiFunction.apply("Alex", 20));


    }

    /*
     *
     * the first generic Type (String) is for the first parameter
     * The second generic type (Integer) is for the second parameter
     * the third one is for the return type
     **/
    static BiFunction<String, Integer, String> upperCaseWithBiFunction = (name, age) ->{
        if(name.isBlank())
            throw  new IllegalArgumentException("");
        System.out.println(age);
        return name.toLowerCase();
    };
}
