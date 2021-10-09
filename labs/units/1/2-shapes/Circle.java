/**
 * Last name: Jatyani
 * First name: Armeet
 * Period: 2
 * 
 * Write a Circle class that extends the Shape class. Do the following:
 * 1. Write the class header.
 * 2. Write a default constructor that initializes the name of the Circle object to "Circle".
 *    You will need to call the constructor of the parent Shape class.
 * 3. Write a void method printMessage() that prints the message "  I have no sides".
 *
 */
//Your code goes here
public class Circle extends Shape {

    /**
     * Default constructor to initialize name of Circle as "Circle"
     * @param - none
     */
    public Circle() {
        // call super (Shape class)
        super("Circle");
    }

    /**
     * prints message
     */
    public void printMessage() {
        System.out.println("I have no sides");
    }
}