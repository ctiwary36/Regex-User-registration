package com.regex;
import java.util.Scanner;
import java.util.regex.*;

import static java.util.regex.Pattern.compile;

public class UserRegistration {

    public boolean firstNameValidation(String firstName) {
        return Pattern.matches("^[A-Z]{1}+[a-z]{3,}$", firstName);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRegistration person= new UserRegistration();
        String firstName = scanner.nextLine();
        System.out.println("Welcome " +firstName+ " to the User Registration Program");
        System.out.println(person.firstNameValidation(firstName));
    }
}