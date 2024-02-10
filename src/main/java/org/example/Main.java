package org.example;

import org.example.Models.TimBank;

import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        System.out.println("Hello world!");

        TimBank timBank = new TimBank();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Welcome to Tim's banking World");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Register");
                    break;
                case 2:
                    System.out.println("Login to your account");
                    break;
                case 3:
                    System.out.println("Thanks for using Tim's App");
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
                    break;
            }
        }
    }
    // String firstName, String lastName, String email, String password, double balance...




}