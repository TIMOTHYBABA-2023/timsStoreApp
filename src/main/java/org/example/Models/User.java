package org.example.Models;

public class User {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private double balance;

    public User(String firstName, String lastName, String userName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastName = userName;
        this.email = email;
        this.password = password;
        this.balance = 0.0;

    }

    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void depositFunds(double amount){
        balance += amount;
    }

    public boolean withdrawFunds(double amount){
        if (balance > amount ){
            balance -= amount;
            System.out.println("Withdraw successful and new balance is " + getBalance());
            return true;
        }else  System.out.println("Insufficient funds");
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
