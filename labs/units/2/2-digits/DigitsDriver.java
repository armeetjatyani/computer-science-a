import java.util.Scanner;
/**
* Last name: Jatyani
* First name: Armeet
* Student ID: 12106210
* Period: 2
* 
* Unit 2 Lab 2 - Digits
* 
* Write a program that inputs a positive three digit integer. 
* and prints out the digits one per line.
* Sample run:
* Please enter a three digit number: 678
* The digits of the three digit number 678 are
* 6
* 7
* 8
* 
* Follow the directions given within the code to get user input, 
* create a Digits object, and print it.
*/
public class DigitsDriver {
	 /**
     * main sets things in motion
     * @param args - command line arguments
     */
	public static void main(String[] args) {
		//Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

		//Prompt the user for a three digit number
        System.out.print("Enter a three digit number: ");


		//Read in the number entered by the user
        int number = scanner.nextInt();


		//Create a Digits object with the number given
        Digits digitsNumber = new Digits(number);


		//Print the Digits object
		System.out.println("The three digits of the number " + number + " are\n" + digitsNumber.toString());

	}

}