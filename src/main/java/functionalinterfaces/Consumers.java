package functionalinterfaces;

import java.util.function.Consumer;

public class Consumers {
    public static void main(String[] args) {
        greetCustomer(new Customer("Zack", "04 407 5328"));
        greetCustomConsumer.accept(new Customer("Olivier", "06 855 9377"));
    }
    //declarative with Consumer Functional interface
    static Consumer<Customer> greetCustomConsumer = customer -> System.out.println("Hello " + customer.customerName +
            ", thanks for registering to the plateform yout phone number " + customer.customerPhoneNumber);
    //imperative
    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering to the plateform yout phone number " + customer.customerPhoneNumber);
    }
    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
