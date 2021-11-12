package model;

public class Tester {
    public static void  main(String[] args){
        Customer customer = new Customer("first","second","123-345-6679","j@domain.com");
        System.out.println(customer);
        //customer.setEmail("email");
        //customer.setPhoneNumber("13");
        Customer customer2 = new Customer("first","second","123","email");
        
    }
}
