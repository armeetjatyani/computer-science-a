# U3L1 - Creating Arrays
`10-18-21`<br>

## Vocabulary
- **data structure**: a way of storing and organizing data in a program
- **one dimensional array**: linear structure that stores one or more values of the same datatype
- **element**: an item stored in the array
- **index**: values that count each location in the array, starting from 0
- **immutable**: size of the array cannot change, datatype of array cannot change
- Strings and Arrays are both immutable
- **initializer list**: creates and initializes the elements in an array to a list of values given inside curly braces { }
- **length**: `array.length` the length of an array is how many elements it can store
- **`ArrayIndexOutofBoundsException`**: when an index value outside of [0, length - 1], index is out of bounds of array
- **When to Use Enhanced for Loops** 
    - Looping through all the values in an array without changing their values
    - Looping through all the values in an array in order starting at index: 0

- **Do not use when**
    - you need the index of the element
    - you need to change the values in the array
    - you want to loop through only part of the array

## Exercise
**Do this** Declare and init an array called flavors to store 5 flavors.

```java
// declare and instantiate on 1 line (empty)
String[] flavors = new String[5];

// declare and predefine all one 1 line
String[] predefinedFlavors = {"vanilla", "chocolate", "orange", "violet", "mystery"};
```

# U3L2 - 
`10-19-21`<br>

# U3L3 - Traversing Arrays with For Loops
`10-20-21`<br>

# U3L4 - Traversing Arrays with While Loops
`10-20-21`<br>
## Vocab
- **while loop**: executes a block of code repeatedly as long as a condition is true
- **infinite loop**: a loop that never stops running

# U3L5 - Storing objects into Arrays
`10-22-21`<br>
## Vocab
- **polymorphism** ability to perform an action in diff ways, super/child class 

# U3L6 - Traversing Arrays with Enhanced for Loops
`10-25-21`<br>
## Vocab
- **enhanced for-loop** simplified for loop that iterates through every element of the array, starting at element 0 

## Do This:
Draw a 3 column table on a piece of paper. For each type of loop, write down situations when it is best to use it instead of the other types of loops.

- while loop
    - when you don't know for how long you will have to iterate and you want to keep going until a conditional is met
- for loop 
    - when you need the index
- enhanced for loop
    - when you just need to quickly go through each element (element only) of your array