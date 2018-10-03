/*
 * Author: Ahmed A.
 * Last edit: 3rd of October, 2018
 * The program calculates the volume of water used to manufacture the computer components of the user.
 */

package incometax;

//Import keypress scanner to detect keystrokes within console, and decimal format storage variable
import java.util.Scanner;
import java.text.DecimalFormat;

public class IncomeTax {
    
    public static void main(String[] args) {
        
        //Keypress scanner within console window
        Scanner keyPress = new Scanner(System.in);        
        //Declaring a monetary decimal format
        DecimalFormat monetary = new DecimalFormat ("$#,##0.00");

        //Variable declaration area
        double salary, amntOwed, tax;
       
        System.out.println("Enter your salary: $ ");
        salary = keyPress.nextDouble();
        
        //Condition statements beginning
        if (salary >=205842.00)
        {
            //Initializes tax rate to 33% because user makes $205,842+
            tax = .33;
            amntOwed = salary * tax;
            //Displays output text in console window
            System.out.println("\nYour salary is: " + monetary.format(salary));
            System.out.println("You owe the government: " + monetary.format(amntOwed));
            //Closes scanner
            keyPress.close();
        }
        else if (salary >=144489.00)
        {
            //Initializes tax rate to 33% because user makes $205,842+
            tax = .29;
            amntOwed = salary * tax;
            //Displays output text in console window
            System.out.println("\nYour salary is: " + monetary.format(salary));
            System.out.println("You owe the government: " + monetary.format(amntOwed));
            //Closes scanner
            keyPress.close();
        }
        else if (salary >=93208.00)
        {
            //Initializes tax rate to 33% because user makes $205,842+
            tax = .26;
            amntOwed = salary * tax;
            //Displays output text in console window
            System.out.println("\nYour salary is: " + monetary.format(salary));
            System.out.println("You owe the government: " + monetary.format(amntOwed));
            //Closes scanner
            keyPress.close();
        }
        else if (salary >=46605.00)
        {
            //Initializes tax rate to 33% because user makes $205,842+
            tax = .205;
            amntOwed = salary * tax;
            //Displays output text in console window
            System.out.println("\nYour salary is: " + monetary.format(salary));
            System.out.println("You owe the government: " + monetary.format(amntOwed));
            //Closes scanner
            keyPress.close();
        }
        else
        {
            //Initializes tax rate to 33% because user makes $205,842+
            tax = .15;
            amntOwed = salary * tax;
            //Displays output text in console window
            System.out.println("\nYour salary is: " + monetary.format(salary));
            System.out.println("You owe the government: " + monetary.format(amntOwed));
            //Closes scanner
            keyPress.close();
        }
        //Condition statements end
    }
    
}
