package org.example.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimBank {

    public List<User> users = new ArrayList<>();
    public User currentUser = null;

    LoggedInUser loggedInUser = new LoggedInUser();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public boolean registerUser(String userName, String password){
//        System.out.println("Enter firstName: ");
//        String firstName = scanner.next();
//        System.out.println("Enter lastName: ");
//        String lastName = scanner.next();
//        System.out.println("Enter userName: ");
//        String userName = scanner.next();
//        System.out.println("Enter password: ");
//        String password = scanner.next();
//        System.out.println("Enter email: ");
//        String email = scanner.next();

        for (User user: users){
            if (user.getUserName().equals(userName)){
                System.out.println("User already exist.");
                return false;
            }
        }

        User newUser = new User(userName, password);
        users.add(newUser);
        System.out.println("Registration Successful");
        return true;
    }

    public boolean loginUser(String username, String password){
//        System.out.println("Enter username: ");
//        String username = scanner.next();
//        System.out.println("Enter password: ");
//        String password = scanner.next();

        for (User user: users){

            if ((user.getUserName().equals(username)) && (user.getPassword().equals(password)))

                currentUser = user;
            System.out.println("Login successful");
            return false;

            }

        System.out.println("Invalid login details. try again");
        return false;
        }


    public void handleLoggedInUser(Scanner scanner) {

        if (currentUser == null){
            System.out.println("No user is currently logged in. Please log in first");
            return;
        }

        while (true) {

            System.out.println("Welcome, " + currentUser.getUserName() + "!");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is " + currentUser.getBalance());
                    break;
                case 2:
                    System.out.println("Enter the deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    currentUser.depositFunds(depositAmount);
                    System.out.println("Deposit was successful. Your new balance is " + currentUser.getBalance());
                    break;
                case 3:
                    System.out.println("Enter the withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();

                    currentUser.withdrawFunds(withdrawalAmount);
                    break;

                case 4:
                    currentUser = null;
                    System.out.println("Logged out successfully");
                default:
                    System.out.println("Invalid choice, please try again");
                    break;
            }
        }


        }




    @Override
    public String toString() {
        return "TimBank{}";
    }
}
