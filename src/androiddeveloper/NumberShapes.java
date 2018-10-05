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
public class NumberShapes {

    // main method begins execution of Java application
    public static void main(String[] args) {
        // create number class
        class Number {
            int number; // initialize integer type variable
            
            // method that determines if number is triangular
            public boolean isTriangular() {
                int x = 1; // initialize and declare counter variable
                int triangularNumber = 1; // initialize and declare triangular number
                
                // loop that executes until index counter variable x is less than input number value
                while (triangularNumber < number) {
                    x++; // increment counter
                    
                    triangularNumber = triangularNumber + x; // add triangular number and counter to create sequence of triangular numbers
                }
                
                // execute when triangular number has same value as input number
                if (triangularNumber == number) {
                    return true; // return true to indicate number is a triangular number
                // execute when triangular number does not have same value as input number
                } else {
                    return false; // return false to indicate number is not triangular
                }   
            }
            
            // method that determines if number is square
            public boolean isSquare() {
                double squareRoot = Math.sqrt(number); // initialize and declare square root value of input number
                
                // execute when squareRoot variable value is a whole number (int)
                if (squareRoot == Math.floor(squareRoot)) {
                    return true; // return true to indicate the number is a square number
                } else {
                    return false; // return false to indicate the number is not a square number
                }
            }
        }
     
        Number myNumber = new Number(); // construct that creates object-type of number
        
        myNumber.number = 6; // set integer for number object
        
        System.out.println(myNumber.isTriangular()); // display information
        
        System.out.println(myNumber.isSquare()); // display information
        
    }
}
