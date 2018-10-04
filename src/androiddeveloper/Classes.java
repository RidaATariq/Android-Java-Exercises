/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package androiddeveloper;

/**
 *
 * @author jdalv
 */
public class Classes {

    // main method begins execution of Java application
    public static void main(String[] args) {
        // create user class
        class User {

            int score; // initialize integer variable

            // method that returns boolean value to determine if user has won game
            public boolean hasWon() {
                // execute if user score is equal or greater than 100
                if (score >= 100) {
                    return true;
                    // execute if user score is not equal or greater than 100
                } else {
                    return false;
                }
            }
        }

        User bob = new User(); // construct that creates object-type of user 

        bob.score = 10; // set score for bob object

        System.out.println(bob.score); // display bob object score

        System.out.println(bob.hasWon()); // display boolean value on bob object winning
        
        // create number class
        class Number {
            
            int number; // initialize integer variable
            
            // method that returns boolean value to determine if number is positive
            public boolean isPositive() {
                // execute if number is greater than 0
                if (number > 0) {
                    return true;
                // execute if number is less than 0
                } else {
                    return false;
                }
            }
        }
        
        Number myNumber = new Number(); // construct that creates object-type of number
        
        myNumber.number = 7; // set number for number object
        
        // execute if number is positive
        if (myNumber.isPositive()) {
            System.out.println(myNumber.number + " is positive"); // display positive statement
        // execute if number is not positive
        } else {
            System.out.println(myNumber.number + " is not positive"); // display not-negative statement
        }
        
    }

}
