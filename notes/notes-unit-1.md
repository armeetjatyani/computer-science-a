# U1L1 - Welcome to CSA
`8-18-21`<br>
## Vocabulary
- **software engineers** - combine expertise in CS, engineering, and math to design, develop, and test software for home, school, and business use
- **purpose** - programming lang/tool to make apps

# U1L2 - Classes and Objects
`8-19-21`<br>
## Vocabulary
- **OOP** - an approach to creating/using models of physical or imagined objects
- **compile** - translate computer programs from a higher level language to another
- **class** - user defined blueprint of attributes and behaviors of an obj
- **object** - instance of a class
- obj is more specific than class, there is no obj without class
- **attribute** - characteristic of an object
- **behavior** - an action an obj can perform

# U1L3 - Calling Methods
`8-20-21`<br>
## Vocabulary
- **software** - set of specific instructions that enables a computer to perform a task
- **method** - a named set of instructions to perform a task
- **syntax error** - mistakes in code such that typos that do not follow the syntax rules of the programming language

# U1L4 - Conditionals and Debugging
`8-23-21`<br>

## Vocabulary
- **syntax error** - mistakes in code such that typos that do not follow the syntax rules of the programming language
- **debugging** - process to find/fix errors in code
- **logic error** - our code runs but doesn't do what we expect it to do
- **boolean** - a datatype that can be either true or false

# U1L5 - More About Objects
`8-24-21`<br>

## Vocabulary
- **constructor** - code that creates an obj to manipulate and use based on a class
- **2 types of constructors** - default, parameterized
- **parameterized constructors** - constr. with parameters that allow for object data to be set to something specific
- **constructor signature** - first line of constructor which includes the constructor name
- **formal parameter** - name of attributes in the constructor signature
- **actual parameter** - value given to attribute on init
- **efficiency** - best outcome with elast amount of waste

# U1L6 - While Loops and Practice
`8-25-21`<br>

## Vocabulary
- control structure - using conditionals and loops to affect flow of program

# U1L7 - More with Conditionals
`8-26-21`<br>

## Vocabulary
- **logical operator** - !, read as "not", tells program to switch to oppositie of true/false

# U1L8 - Introduction to Code Review
`8-27-21`<br>

## Vocabulary
- code reviewers should look at functionality, design/complexity, comments, naming
- **code review** - feedback cycle in which programmers help improve one another's code by leaving questions and comments

# U1L9 - Inheritance and Methods
`8-30-21`<br>

## Vocabulary
- inheritance: principle where subclass inherit instance variables and methods of parent (superclass)
- subclass: class taht inherits attributes and behaviors from superclass
- superclass: a class from which subclasses are made
- class header: class {classname} {}
- constructors are not inherited
- **is-a relationship** - (subclass) is a (superclass)
- in subclass's constructor, you must call parent constructor with super() as the first line

# U1L10 - More Methods, More Features
`8-31-21`<br>

## Vocabulary
- **edge case** - a situation in a program that produces a diff outcome and requires special error handling
- **pseudocode** - simple way to write an alg in english

`Pseudocode (Classwork)`
```
method turnAround():
    turn left
    turn left

method takeAllPaint():
    while painter on bucket:
        take paint

method moveFast():
    if can move, move
```

# U1L11 - Painting Methods
`9-1-21`<br>

## Vocabulary
- **parameter** - a placeholder is a val you can pass into a method
```
paintLineSegment():
    repeat 3 times:
        paint
        if can move, move

paintFullLine():
    while can move, paintLineSegment()

paintDiagonalSegment():
    paint
    if can move, move
    turn left
    if can move, move
    turn right
    paint

paintFullDiagonal():
    while can move north:
        paint diag segment
```

# U1L12 - Spray Painter
`9-2-21`<br>

## Vocabulary
- **UML diagram** - used to show relationship between classes (arrows point from subclass to super class, iincluding attributes and behaviors)

# U1L13 - Stamp Painter
`9-3-21`<br>
- a digital image is made of rows and cols of small rects called pixels
- **pixel** - smallest unit of a digital image

# U1L14 - Edge Cases
`9-6-21`<br>

## Vocabulary
- **test driven development** - a process that involves writing the test first, then writing the code to make the test pass

### Group Project (Group 2)
1. public, class, extends, void, super, new, and the basic Java syntax are concepts that I recognize from previous lessons.
2. When the Evernote "App" is created, a new session is created and the initializeInjector() function is called in the buildEvernote method.

# U1L15 - Software Engineer Wrap Up
`9-7-21`<br>

## Vocabulary
- **open source** - code that anyone can inspect, modify, and enhance