/**
 * Last name: Jatyani
 * First name: Armeet
 * Period: 2
 * 
 * Write a Shape class. Do the following:
 * 1. Write a class header for the Shape class.
 * 2. Create a String attribute that holds the name of the Shape object. Use the keyword String to
 *    declare a variable of your choice.
 * 3. Write a parameterized constructor that initializes the name of the Shape object.
 * 4. Write a void method printName() that prints the name of the Shape object.
 *
 */
//Your code goes here
public class Shape {
    // name of shape
    String name;

    /**
     * Constructor to initialize name of Shape object
     * @param String name - name of shape
     */
    public Shape(String name) {
        // set this shape's name to the provided argument
        this.name = name;
    }

    /**
     * Prints name of this Shape object
     * @param - none
     */
    public void printName() {
        System.out.println("I am a " + this.name);
    }
}
