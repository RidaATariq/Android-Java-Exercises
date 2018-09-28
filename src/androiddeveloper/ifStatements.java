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
public class ifStatements {
    
    // main method begins execution of Java application
    public static void main(String[] args) {
        int age = 35; // initialize and set integer value
        
        if (age == 18) {
            System.out.println("User is 18");
        } else if (age < 18) {
            System.out.println("User is under 18");
        } else {
            System.out.println("User is over 18");
        }
        
        int[] array = {19, 28}; // initialize and set array values
        
        // execute if second array integer is greater than the first array integer
        if (array[1] > array[0]) {
            System.out.println("The second integer (" + array[1] + ") is greater than the first integer (" + array[0] + ")");
        // execute if second array integer is less than the first array integer
        } else if (array[1] < array[0]) {
            System.out.println("The second integer (" + array[1] + ") is less than the first integer (" + array[0] + ")");
        // execute if second array integer is equal to the first array integer
        } else {
            System.out.println("The integers are the same.");
            
        }
}
