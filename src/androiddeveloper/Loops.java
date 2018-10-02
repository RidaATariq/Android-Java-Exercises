/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package androiddeveloper;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jdalv
 */
public class Loops {

    // main method begins execution of Java application
    public static void main(String[] args) {
        
        int x = 1; // initialize and set integer variable to 1
        
        // loop that executes until integer x variable is greater than or equal 10
        while (x <= 5) {
            System.out.println(2 * x); // display even numbers from 1 to 10
            x++; // increment counter using x variable
        }
        
        // loop that executes until index counter variable y equals to 5
        for (int y = 1; y <= 5; y++) {
            System.out.println(y * 2); // display even numbers from 1 to 10
        }
        
        // loop that executes until index counter variable i equals 30
        for (int i = 3; i <= 30; i = i + 3) {
            System.out.println(i); // display multiples of 3
        }
        
        System.out.println(""); // display empty line
        
        int z = 1; // initialize and set integer variable to 1
        int triangularNumber = 1; // initialize and set variable to 1
        
        // loop that executes until index counter variable z is equal to 10
        while (z <= 10) {
            System.out.println(triangularNumber); // display triangular number
            
            z++; // increment index counter
            
            triangularNumber = triangularNumber + z; // increment triangular number by index counter value
        }
        
        System.out.println(""); // display empty line
        
        String[] familyMembers = {"Jose", "Angel", "Diego", "Anthony", "Guadalupe"};
        
        // modified for-loop that executes until all elements in array are read
        for (String name : familyMembers) {
            System.out.println(name);
        }            
        
        System.out.println(""); // display empty line
        
        List<String> famMembers = new ArrayList<String>(); // initialize list-type array with specified content
        
        famMembers.add("Jose");
        famMembers.add("Angel");
        famMembers.add("Diego");
        famMembers.add("Anthony");
        famMembers.add("Guadalupe");
        
        // modified for-loop that executes until all elements in array are read
        for (String name : famMembers) {
            System.out.println(name);
        }    
            
    }
}
