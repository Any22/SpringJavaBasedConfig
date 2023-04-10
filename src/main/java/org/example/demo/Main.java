package org.example.demo;

import org.example.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext ;
        applicationContext= new AnnotationConfigApplicationContext(SpringConfig.class);

        Customer customer = (Customer) applicationContext.getBean("customerBean");

        customer.setCustomerName("Lisa");
        customer.setCustomerAge(23);
        customer.setAccountType(AccountType.SAVINGS);

        System.out.println( customer.registerAccount(customer.getCustomerName(), customer.getCustomerAge(),
               customer.getAccountType()));

    }
}