/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package androiddeveloper;

import java.util.*;

/**
 *
 * @author jdalv
 */
public class Arrays {

    // main method begins execution of Java application
    public static void main(String[] args) {
        int[] primeNumbers = {2, 3, 5, 7, 11, 13}; // initialize and set array values
        System.out.println("The third item in the prime numbers array is " + primeNumbers[2]);
        
        System.out.println("Number of items in prime numbers array is " + primeNumbers.length);
        
        List list = new ArrayList(); // initialize list-type array
        
        list.add(2); // method to add item to list array
        list.add(3); // method to add item to list array
        list.add(5); // method to add item to list array
        
        list.remove(1); // method to remove item from list array
        
        System.out.println("The second item in the list is " + list.get(1));
        
        System.out.println("The current items in the list are " + list.toString());
        
        List countries = new ArrayList(); // initialize list-type array
        
        countries.add("United States of America"); // method to add item to list array
        countries.add("United Kingdom"); // method to add item to list array
        countries.add("Mexico"); // method to add item to list array
        
        countries.remove(1); // method to remove item from list array
        
        System.out.println("Countries in our list array: " + countries.toString());
        
        Map map = new HashMap(); // intialize map object
        
        map.put("Son", "Jose"); // method that adds item to map object
        map.put("Father", "Daniel"); // method that adds item to map object
        
        map.remove("Father"); // method that removes item from map object
        
        System.out.println(map.toString());
        System.out.println("Size of map object: " + map.size());
        
        
    }
}
