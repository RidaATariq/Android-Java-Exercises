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
public class Variables {

    // main method begins execution of Java application
    public static void main(String[] args) {
        int favoriteNum = 28; // initialize and set integer value
        System.out.println("My favorite number is " + favoriteNum + "!");

        double favoriteDecimal = 19.28; // initialize and set double (decimal) value
        System.out.println("My favorite decimal number is " + favoriteDecimal + "!");

        boolean amIMale = true; // intialize and set boolean (true or false) value
        System.out.println("Am I a male? Answer: " + amIMale);

        String myName = "Jose"; // initialize and set String value
        System.out.println("Ny name is " + myName + ", and my favorite number is " + favoriteNum + ".");

        double a = 6.7; // initialize and set double value
        double b = 3.2; // initialize and set double value
        System.out.println(a + b - 7.3);

        String myString = "hdsaghfkjgdsjfhgsdfjkhgf"; // initialize and set String value
        System.out.println("The length of my string is " + myString.length());

        String myFirstName = "Jose"; // initialize and set String value
        String myLastName = "Alvarez"; // initialize and set String value
        int length = myFirstName.length() + myLastName.length(); // initialize and set integer value of character calculation
        System.out.println("The number of characters in my full name is " + length);
    }
}
