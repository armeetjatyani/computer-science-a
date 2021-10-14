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
 * Do the following:
 *
 * 1. Create three instance variables to hold the three digits of the number
 * 2. Write a private helper method called split that splits the given three digit number
 *    to three separate digits. Initialize the three instance variables here.
 * 3. Write a constructor that takes in a three digit number and calls the
 *    split method written above.
 * 4. Write a toString method that returns the string to print the three digits of the number in
 *    the following format:
 *    The three digits of the number 678 are
 *    6
 *    7
 *    8
 * 5. Include Javadoc style comments for each method.
 *
 */

public class Digits {

  // private fields/attributes
  private int digit1;
  private int digit2;
  private int digit3;

  /**
   * Constructor that takes in a 3 digit num
   * Splits the digits and initializes all attributes (digit1, digit2, digit3)
   * @param num - 3 digit number
   */
  public Digits(int num) {
    // call split method
    split(num);
  }

  /**
   * split method will take the 3 digits of a number and put them into digit1, digit2, digit3
   * using modulus operator for this
   * since this method is private, it can only be used inside the class
   * @param num - the 3 dig number
   */
  private void split(int num) {
    digit3 = num % 10;
    num /= 10;
    digit2 = num % 10;
    num /= 10;
    digit1 = num % 10;
  }

  /**
   * Get a String representation of our number's 3 digits
   * @noparam
   * @return String - string representation of the 3 digits
   */
  public String toString() {
    return digit1 + "\n" + digit2 + "\n" + digit3;
  }
}
