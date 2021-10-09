/**
 * Last name: Jatyani
 * First name: Armeet
 * Period: 2
 * 
 * Write a Square class that extends the Rectangle class. Do the following:
 * 1. Write the class header.
 * 2. Write a default constructor that initializes the name of the Square object to "Rectangle".
 *    You will need to call the constructor of the parent Rectangle class.
 * 3. Write a void method printMessage() that prints the message 
 *    "I am a 4 sided figure
 *       I have equal sides"
 *    You must call the parent's printMessage() method using super.printMessage().
 *
 */
//Your code goes here

public class Square extends Rectangle {
    /**
     * Default constructor - initalize name of Square object to "Rectangle"
     */
    public Square() {
        // set name of this Square to "Rectangle" by calling super constructor
        super();
    }

    /**
     * print a message
     */
    public void printMessage() {
        // call super's printMessage function
        super.printMessage();
        System.out.println("I have equal sides");
    }
}