package functionalinterfaces;

import java.util.List;
import java.util.function.Supplier;

public class Suppliers {
    public static void main(String[] args) {
        //declarative With Supplier Functional interface
        System.out.println(getDBConnectionUrl());
        System.out.println(getDbConnectionUrlSupplier.get());
        System.out.println(getDbConnectionUrlsSupplier.get());
    }

    static String getDBConnectionUrl(){
        return "jdbc://localhost:5250/users";
    }

    //With a Supplier
    static Supplier<String> getDbConnectionUrlSupplier = () ->  "jdbc://localhost:5250/users";
    static Supplier<List<String>> getDbConnectionUrlsSupplier = () ->
            List.of("jdbc://localhost:5250/users",
                    "jdbc://localhost:5250/products",
                    "jdbc://localhost:5250/people"
            );
}
