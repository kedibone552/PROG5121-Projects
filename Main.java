/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programming1apoe;
/**
 *
 * @author ST10522809
 */

import java.util.Scanner;

/**
 * Main class for the registration and login application.
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("   REGISTRATION AND LOGIN SYSTEM");
        System.out.println("");

        // Collect the user's personal details
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter a username: ");
        String username = input.nextLine();

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        System.out.print("Enter your South African cell phone number: ");
        String cellPhoneNumber = input.nextLine();

        // Create a Login object
        Login user = new Login(firstName, lastName);

        // Register the user
        String registrationMessage = user.registerUser(
                username, password, cellPhoneNumber);

        System.out.println("\n" + registrationMessage);

        // Only continue to login if all registration details are valid
        if (registrationMessage.equals(
                "Username successfully captured.\n"
                + "Password successfully captured.\n"
                + "Cell phone number successfully added.")) {

            System.out.println("\n----------- LOGIN -----------");

            System.out.print("Enter your username: ");
            String enteredUsername = input.nextLine();

            System.out.print("Enter your password: ");
            String enteredPassword = input.nextLine();

            boolean loginSuccessful = user.loginUser(
                    enteredUsername, enteredPassword);

            System.out.println(user.returnLoginStatus(loginSuccessful));

        } else {
            System.out.println("\nRegistration was unsuccessful.");
        }

        input.close();
    }
}  

