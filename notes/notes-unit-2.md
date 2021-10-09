# U2L1-2 - Defining Attributes, Using Variables
`9-17-21`<br>

## Vocabulary
- **public** - means that something is accessible outside the class
- **private** -  you can’t access something from outside the class, only accessible within the class
- **instance variables/fields** -  variables that only exist within a class
- **has a relationship** -  a relationship between objects and instance variables
- **data encapsulation** -  information hiding, an object oriented programming concept where the details of a class are hidden form the user
- **primitive variables** -  numbers, strings, booleans
    - double -  decimals
    - int -  integers
    - boolean -  true/false
- **reference variables** -  objects
    - string -  text
- **variables** -  containers that allow us to hold information
- **literal** - a source code representation of a value
## Lesson
### Scanner
```java 
// initializing Scanner object
Scanner input = new Scanner(System.in);

// 3 scanner methods
nextInt();
nextDouble();
nextLine(); // lines
next(); // words

// for an int
int userInt = input.nextInt();

// for a double
double userDouble = input.nextDouble();

// for a String
String userString = input.nextLine();
```

```java
// always prompt the user
System.out.print("Enter an int:" );

// grab user input
int userInt = input.nextInt();

// display input to user
System.out.println("You entered in: " + userInt);

// close the scanner
input.close();
```

## Practice
Create trace table. <br>
line, location, miles,gallons<br>
1, "New York City", 0, 0<br>
2, "New York City", 0, 0<br>
3, "New York City", 100, 0<br>
...<br>
10, "Atlanta", 800, 32<br>

# U2L3 - Writing Constructors
`9-20-21`<br>
## Vocabulary
- **constructor** - sets the initial state of the object
- **public** - visible to all other classes
- **constructor signature** - first line of constructor(public + constructor name + formal parameters)
- **instantiating** - when you create an instance of the class 
```java
new Painter(2, 3, "North", 3); // creating new instance of Painter
```

## Code
### `Dessert.java`
```java
public class Dessert {
  // TO DO: Declare instance variables called flavor, quantity, and price.
  private String flavor;
  private int quantity;
  private double price;

  	// TO DO: Write the constructor taking parameters newFlavor for flavor
    // newQuantity for quantity, and newPrice for price.
  public Dessert(String newFlavor, int newQuantity, double newPrice) {
    this.flavor = newFlavor;
    this.quantity = newQuantity;
    this.price = newPrice;
  }

  public void printInfo() {
    System.out.println("Flavor = " + flavor + " Quantity = " + quantity + " Price = " + price);
  }  
}
```

### `MyFoodTruck.java`
```java
import java.util.Scanner;

public class MyFoodTruck {
  public static void main(String[] args) {
    
    // TO DO: Create a Scanner object.
    Scanner sc = new Scanner(System.in);


    // TO DO: Get user input for the flavor, quantity, and price.
    System.out.print("Please enter flavor: ");
    String flavor = sc.nextLine();

    System.out.print("Please enter quantity: ");
    int quantity = sc.nextInt();

    System.out.print("Please enter price: ");
    double price = sc.nextDouble();


    // TO DO: Create a Dessert object with the user input.
    Dessert cake = new Dessert(flavor, quantity, price);
    
    cake.printInfo();

    // TO DO: Close the Scanner object.
    sc.close();
    
  }
}
```

# U2L4 - Writing Multiple Constructors
`9-21-21`<br>

## Vocabulary
- **overloading** - the ability to have 2+ methods with the same name but diff signatures
- **constructor overloading** - when a class has multiple constructors with a different signatures
- **no-argument constructor** - constructor with 0 params

## **Code**
### **`Dessert.java`**
```java
public class Dessert {
  // instance variables
  private String flavor;
  private int quantity;
  private double price;

  /**
  	* No param constructor
	* @noparam
  	*/
  public Dessert() {
    this.flavor = "red-velvet";
    this.quantity = 6;
    this.price = 6.50;
  }
  
  /**
	* 2 param constructor that sets default value of quantity to 12
	* @param newFlavor - flavor of dessert
	* @param newPrice - price of dessert
	*/
  public Dessert(String newFlavor, double newPrice) {
    this.flavor = newFlavor;
    this.quantity = 12;
    this.price = newPrice;
  }
  
  /**
  	* 3 param constructor
  	* @param newFlavor - name of dessert flavor
  	* @param newQuantity - number of desserts
  	* @param newPrice - price of each dessert
  	*/
  public Dessert(String newFlavor, int newQuantity, double newPrice) {
    this.flavor = newFlavor;
    this.quantity = newQuantity;
    this.price = newPrice;
  }

  /**
  	* print this dessert's information
  	* @noparam
  	*/
  public void printInfo() {
    System.out.println("Flavor = " + flavor + " Quantity = " + quantity + " Price = " + price);
  }  
}
```

# U2L5 - Manipulating Variables and Object Data
`9-22-21`<br>

## Vocabulary
- **expression** - combination of `operands` and `operators` that evaluate to a single value

# U2L5 - Manipulating Variables and Object Data
`9-23-21`<br>

## **Vocabulary**
- **evaluate** - determining the value of an expression
- **expression** - a combination of data and operators that evaluates to a single value
- **concatenation** - merging 2 strings into 1
- **compound assignment operator** - shortcut syntax (+=, -=, /=, *=) to perform an operation on both operands and store the restul into the operand on the left
- **ArithmeticException** - err caused by invalid arithmetic operation
- **operand** - the data that is operated on

# U2L6 - Minimizing Errors in Initialization
`9-24-21`<br>

## Vocabulary
- **this keyword** - when you want to access the instance variables 

# U2L7 - Writing Constructors for Hierarchies
`10-4-21`<br>


## Vocabulary
- **inheritance** - OOP principle where a subclass *inherits* the instance variables and methods of a superclass
- **DRY** - don't repeat yourself

# U2L8 - Accessing Object Data
`10-5-21`<br>

## Vocabulary
- **accessor or getter method** - public, allowing it to get the value stored in the instnace variable and give it to the outside class asking for this information
- **dot operator** - used to call a method in class
- **state** - the object's attributes, or instance variables values

# U2L9 - Modifying Object Data
`10-6-21`<br>
## Vocabulary
- **mutator or setter method** - changes the value of an instance variable

# U2L10 - Displaying Object Information
`10-7-21`<br>
## Vocabulary
- **override** - defining a method in a subclass with the same method signature as the superclass method (inherited method)
- **escape sequence** - starts with a "\" to indicate how to display String (\n, \\, \" for example)