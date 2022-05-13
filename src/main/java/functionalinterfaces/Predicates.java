package functionalinterfaces;

import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {
        System.out.println("With predicate");
        System.out.println(isPhoneNumberValidPredicate.test("04 407 5328"));

        System.out.println("Is phine number valid and contains number 3 = " +isPhoneNumberValidPredicate.and(containsNumber3).test("06 855 9377"));
        System.out.println("Is phine number valid and contains number 3 = " +isPhoneNumberValidPredicate.and(containsNumber3).test("06 650 5050"));
    }

    public static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("04") || phoneNumber.startsWith("05") || phoneNumber.startsWith("06") && phoneNumber.length() == 9;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.trim().startsWith("04") || phoneNumber.trim().startsWith("05") || phoneNumber.trim().startsWith("06") && phoneNumber.trim().length() == 9;
    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.trim().contains("3");
}
