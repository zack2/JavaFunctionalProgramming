package optionals;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        Object optionalVal = Optional.of("qjfsngjfngj")
                .orElse("Default value")
                ;
        System.out.println(optionalVal);
    }
}
