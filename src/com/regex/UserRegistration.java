package com.regex;
import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
    public boolean firstNameValidation(String firstName) {
        return Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", firstName);
    }

    public boolean lastNameValidation(String firstName) {
        return Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", firstName);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRegistration person= new UserRegistration();
        System.out.println("enter first name");
        String firstName = scanner.nextLine();
        System.out.println("enter last name");
        String lastName = scanner.nextLine();
        System.out.println("Welcome " +firstName+ " " +lastName+ " to the User Registration Program");
        System.out.println(person.firstNameValidation(firstName));
        System.out.println(person.lastNameValidation(lastName));
    }
}