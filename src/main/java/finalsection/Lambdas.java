package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        //normal way
        Function<String, String> upperCaseName = name -> name.toUpperCase();
        //with method reference
        Function<String, String> upperCaseNameWithMethodRef = String::toUpperCase;

        /*
         *
         * the first generic Type (the input eg:String) is for the first parameter
         * The second generic type (the output eg:Integer) is for the second parameter
         * the third one is for the return type
         **/
         BiFunction<String, Integer, String> upperCaseWithBiFunction = (name, age) ->{
            if(name.isBlank())
                throw  new IllegalArgumentException("");
            System.out.println(age);
            return name.toLowerCase();
        };
        System.out.println(upperCaseWithBiFunction.apply("Alex", 20));


    }


}
