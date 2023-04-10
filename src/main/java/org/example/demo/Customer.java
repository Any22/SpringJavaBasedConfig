package org.example.demo;

public class Customer {
    private String customerName;
    private int customerAge;

    private AccountType accountType ;



    public Customer( String customerName,int customerAge, AccountType accountType) {
        this.customerName = customerName;
        this.customerAge = customerAge;


    }
    public Customer(){

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }


    public String registerAccount(String customerName, int customerAge, AccountType accountType) {

        return "The customer"+" " + customerName+" "+ "is registered to" + " "+ accountType;
    }
}
