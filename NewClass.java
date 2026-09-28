
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Matha
 */
public class NewClass {

/**
 * StudentMarkEvaluation.java
 * ICE Task 3 - Decision Structures in Java
 * This program evaluates a student's mark and determines:
 * - If they qualify for a distinction (75+)
 * - If they passed or failed (50+ = pass)
 */

public class StudentMarkEvaluation {
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        // Question 1.1 
        
        System.out.print("Enter Student Mark: ");
        int studentMark = input.nextInt(); 
        
        // Question 1.2 
        
        if (studentMark >= 75) {
            System.out.println("\nStudent qualifies for a distinction.");
        }
        
        //  Question 1.3 
        
        if (studentMark >= 50) {
            //  Question 1.4 
            System.out.println("Congratulations, you passed!");
            System.out.println("You may proceed to the next module.");
        } else {
           
            System.out.println("Unfortunately, you have failed.");
            System.out.println("Please consult your lecturer for assistance.");
        }
        
        input.close();
        
    } 
    
} 
   
}
