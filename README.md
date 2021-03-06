# JAVA2
 Java advanced Classwork and activities.


## [Types of Classes in Java](https://www.javatpoint.com/types-of-classes-in-java)
![types-of-classes-in-java](https://user-images.githubusercontent.com/83961643/161749874-1a37502b-39a4-4b6e-b1f8-43052d400610.png)

Anonoymous Class 
[More on classes](https://cs.lmu.edu/~ray/notes/javaclasses/)

## [Types of Inheritance](https://simplesnippets.tech/inheritance-in-java-types-of-inheritance/)
![java-types-of-inheritance-800x445](https://user-images.githubusercontent.com/83961643/161750352-e21a3282-af48-4ae8-bbfe-d7d24a9129af.jpg)


##  Java Abstraction

The abstract keyword is a non-access modifier, used for classes and methods: Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class). Abstract method: can only be used in an abstract class, and it does not have a body.
- Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
- Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

[W3Schools](https://www.w3schools.com/java/java_abstract.asp)


## Interfaces
- An interface is a completely "abstract class" that is used to group related methods with empty bodies. 
- To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). The body of the interface method is provided by the "implement" class.


Notes on Interfaces:

Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
Interface methods do not have a body - the body is provided by the "implement" class
On implementation of an interface, you must override all of its methods
Interface methods are by default abstract and public
Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)
Why And When To Use Interfaces?

1) To achieve security - hide certain details and only show the important details of an object (interface).

2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma.

[W3Schools](https://www.w3schools.com/java/java_interface.asp)


## Casting and promotion 
![png;base646cab73610497bd47](https://user-images.githubusercontent.com/83961643/161496633-e1197b36-1149-4ffa-a464-5aec1ba28459.png)
[ARGUMENT PROMOTION AND CASTING](http://underpop.online.fr/j/java/help/argument-promotion-and-casting-methods-a-deeper-look.html.gz)

Upcasting is casting a subtype to a super type in an upward direction to the inheritance tree. It is an automatic procedure for which there are no efforts poured in to do so where a sub-class object is referred by a superclass reference variable. One can relate it with dynamic polymorphism.
Implicit casting means class typecasting done by the compiler without cast syntax.
Explicit casting means class typecasting done by the programmer with cast syntax.

![Downcasting jpg](https://user-images.githubusercontent.com/83961643/161498232-43f20a09-7273-4da2-bec5-93bc1e595fe4.png)
Downcasting refers to the procedure when subclass type refers to the object of the parent class is known as downcasting. If it is performed directly compiler gives an error as ClassCastException is thrown at runtime. It is only achievable with the use of instanceof operator The object which is already upcast, that object only can be performed downcast.

Another example would be a `sports` folder and in that folder you have different categories like `cricket`, `golf`, `boxing`. In those folders there's objects like golf ball and cricket bat but those objects can't access eachother because they are in different folders. You would need to move to the parent class(main folder called sports) to be able to access all the objects. 
[Geeks for Geeks](https://www.geeksforgeeks.org/class-type-casting-in-java/)

Class cast exeption: 
instanceof 

# Chapter 4: Overriding methods, Polymorphism & Static Classes

## Difference between public, private, protected and default in Java
- Accessibility: anything public is accessible to anywhere , anything private is only accessible in the class they are declared , anything protected is accessible outside the package but only to child classes and default is accessible only inside the package.
- Encapculation: Public modifier provides lowest level of Encapculation and Private modifier provides higher level of Encapsulation in Java.
Another difference is that you can use public modifier with top level class but you cannot make a top level class private in java.You can make inner class private.
- Default: Another difference is that default is package level accessibility i.e. if you don't provide any access modifier to a class, method or variable then Java by default make them accessible inside the package.
- Another difference between protected and default modifier is that protected modifier provides more accessibility than default modifier. You can access a protected member outside the package, but only inside sub classes.

A class defines the characteristics and behaviour of an object.

Example: Game App, each game that a user can play from the aplication can be considered as an object of the Games class.Each game has common characteristics, such as the number of players,game category and score. These characteristics are known as member variables and behavior is specified by methods . A class defines the member variables and methods of objects that share common characteristics. Further,all the games have common methods, such as calculating score, starting the game and displaying game instructions. 

![java-opengenus](https://user-images.githubusercontent.com/83961643/161699521-53aa6ebf-bd99-4745-bb0f-7999e9785fc1.jpg)
[Read More](https://iq.opengenus.org/public-private-protected-in-java/)

## Method Overriding 
If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
1. The method must have the same name as in the parent class
2. The method must have the same parameter as in the parent class.
3. There must be an IS-A relationship (inheritance).
[Read More](https://pragjyotishcollege.ac.in/wp-content/uploads/2020/04/Method-Overriding-in-Java.pdf)

## Virtual Method Invocation:
A virtual function or virtual method in an OOP language is a function or method used to override the behavior of the function in an inherited class with the same signature to achieve the polymorphism.[Read More](https://www.javatpoint.com/virtual-function-in-java)

## Java OOPs Concepts [(Object Orientated Programming) ](https://www.javatpoint.com/java-oops-concepts)
Object-Oriented Programming is a paradigm that provides many concepts, such as inheritance, data binding, polymorphism, etc.
Object means a real-world entity such as a pen, chair, table, computer, watch, etc. Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects. It simplifies software development and maintenance by providing some concepts:

- Object
- Class
- Inheritance
- Polymorphism
- Abstraction
- Encapsulation

![OOP_4p](https://user-images.githubusercontent.com/83961643/161706461-063ddbf6-7b4c-4ed2-910f-bf83c1ce4a48.png)

## [Polymorphism](https://www.javatpoint.com/runtime-polymorphism-in-java)
Polymorphism in Java is a concept by which we can perform a single action in different ways. Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.

There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism. We can perform polymorphism in java by method overloading and method overriding.

If you overload a static method in Java, it is the example of compile time polymorphism. 


## Varargs

Variable arguments: An argument of a method can accept arbitrary number of values. This argument that can accept variable number of values is called varargs. [Read More](https://www.programiz.com/java-programming/varargs)

[convert varargs to List or Array](https://tedblob.com/java-convert-varargs-to-list-or-array/)


## Static Method

A method that belongs to a class rather than an instance of a class. The method is accessible to every instance of a class, but methods defined in an instance are only able to be accessed by that object of a class. 
[Read More](https://www.techopedia.com/definition/24034/static-method-java)
![slide_2](https://user-images.githubusercontent.com/83961643/161718487-d099afa0-934c-4d75-8a37-76d5cdd72faf.jpg) 

[More Notes](https://slideplayer.com/slide/9793159/)

![slide_5](https://user-images.githubusercontent.com/83961643/161718766-51cf54cb-0fa0-410a-bb14-cde0ba97f2d2.jpg)
![slide_3](https://user-images.githubusercontent.com/83961643/161718774-b5ddca0e-a9f0-4e45-805a-e61921275614.jpg)


## A static initialization block in Java

Instance variables are initialized using initialization blocks. However, the static initialization blocks can only initialize the static instance variables. These blocks are only executed once when the class is loaded. There can be multiple static initialization blocks in a class that is called in the order they appear in the program. [More Examples](https://www.tutorialspoint.com/a-static-initialization-block-in-java)


## [Static Import](https://www.geeksforgeeks.org/static-import-java/)

You can access the static members of a class directly without class name or any object. For Example: we always use sqrt() method of Math class by using Math class i.e. Math.sqrt(), but by using static import we can access sqrt() method directly. 


## [Immutable Class](https://www.geeksforgeeks.org/create-immutable-class-java/)

Immutable class in java means that once an object is created, we cannot change its content. In Java, all the wrapper classes (like Integer, Boolean, Byte, Short) and String class is immutable. We can create our own immutable class as well.


## [Singleton Class](https://www.geeksforgeeks.org/singleton-class-java/)

In object-oriented programming, a singleton class is a class that can have only one object (an instance of the class) at a time. After the first time, if we try to instantiate the Singleton class, the new variable also points to the first instance created. So whatever modifications we do to any variable inside the class through any instance, affects the variable of the single instance created and is visible if we access that variable through any variable of that class type defined. 

Purpose: To restrict the limit of the number of object creation to only one. This often ensures that there is access control to resources, for example, socket or database connection.

# Chapter 5: Abstract & Nested Classes
## Modeling Business Problems with Classes

![img](https://user-images.githubusercontent.com/83961643/161742340-72c9af1b-51e3-4361-970f-36ce9707bd87.jpeg)

>> Always use the most generic reference type possible. 


## Abstract Class
Abstract Methods and Classes

An abstract class is a class that is declared abstract???it may or may not include abstract methods. Abstract classes cannot be instantiated, but they can be subclassed.

An abstract method is a method that is declared without an implementation (without braces, and followed by a semicolon), like this:

abstract void moveTo(double deltaX, double deltaY);
If a class includes abstract methods, then the class itself must be declared abstract, as in:

>>`public abstract class GraphicObject {
   // declare fields
   // declare nonabstract methods
   abstract void draw();
}`

When an abstract class is subclassed, the subclass usually provides implementations for all of the abstract methods in its parent class. However, if it does not, then the subclass must also be declared abstract.
[Java Docs: Abstract Class](https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html)

## Absract Method
- Can't have a method body
- Must be declared in an abstract class
- Is overridden in subclasses
- An abstract method can take arguments and return values. 

## Validating Abstract Classes 
- An abstract class may have any number of abstract and nonabstract methods
- Do the following when abstracting: Declare the child class as abstract, Override all abstract methods inherited from the parent class. There will be a complie-time error if you do not execute override. 


## [Final methods and class](https://docs.oracle.com/javase/tutorial/java/IandI/final.html)
You can declare some or all of a class's methods final. You use the final keyword in a method declaration to indicate that the method cannot be overridden by subclasses. The Object class does this???a number of its methods are final.

If the method is final you can't chnage the implementation. 

![ifinal](https://user-images.githubusercontent.com/83961643/161747639-b24e21fd-86fe-4df0-9e2b-82301ef65d06.jpeg)

Benefits of final Variables: 
- Bug prevention
- Thread saftey 

Drawback: Not available for garbage collection 

## Static and Final combined:
A field that is both ststic and final is considered a constant. By convention, constant fields use identifiers consiting of only uppercase letters and underscores. 


## Enumerations (enums)
- Created by using a variation of a Java class
- Provide a complie-time range check 
![enum](https://user-images.githubusercontent.com/83961643/161752469-463c2524-223f-4e35-bd5a-84c6011cc4b4.jpeg)

# Chapter 6: Interfaces & Lambda Expressions: 

## [Java Interface](https://www.programiz.com/java-programming/interfaces)
An interface outlines a contract for a class. The contract outlined by an interface mandates the methods that must be implemented in a class. Classes implementing the contract must fulfill the entire contract or be declared `abstract`. It's like an agreement. 
- Provides specifications that a class (which implements it) must follow.
- Interfaces help us to achieve abstraction in Java.
- Interfaces are also used to achieve multiple inheritance in Java.
- May contain constant fields: Constant fields are permitted in an interface. When you declare a filed in an interface, it's implicity `public`, `static`, and `final`. You can redundantly specify these modifiers. 
- Can be used as a reference type 
- An essential component of many design patterns. 

#### Rules for an interface
>> Access Modifiers: 
All mothods in an interface are public, even if you forget to declare them as public. You may not declare methods as private or protected in an interface.


>> Abstract Modifier:
Since all methods are implicitly `abstract` it is redundant (but allowed) to declare a method as abstract. Because all interface methods are abstract, you may not provide any method implementation, not even an empty set of braces. 


>> Implement Multiple Interfaces: 
A class can implement more than one interface in a comma-separated list at the end of the class declaration. 

### [Default Methods](https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html)
Default methods enable you to add new functionality to the interfaces of your libraries and ensure binary compatibility with code written for older versions of those interfaces.

#### Extending Interfaces That Contain Default Methods

When you extend an interface that contains a default method, you can do the following:

- Not mention the default method at all, which lets your extended interface inherit the default method.
- Redeclare the default method, which makes it abstract.
- Redefine the default method, which overrides it.

Default methods: 
- Are declared by using the keyword `default`
- Are fully implemented methods within an interface
- Provide useful inheritance machanics 

### Static Methods in Interfaces
A static method is a method that is associated with the class in which it is defined rather than with any object. Every instance of the class shares its static methods. This makes it easier for you to organize helper methods in your libraries; you can keep static methods specific to an interface in the same interface rather than in a separate class. 
Like static methods in classes, you specify that a method definition in an interface is a static method with the static keyword at the beginning of the method signature. All method declarations in an interface, including static methods, are implicitly public, so you can omit the public modifier.

### [Extending Interfaces](https://techvidvan.com/tutorials/java-extends-vs-implements/)

Extends: 
>> The extends keyword in Java is useful when we want to inherit the properties and methods of a parent class in our child class.
This extends keyword establishes the inheritance relationship between two classes.
We use it while creating a derived class from the parent class or creating a subclass form the superclass.
The rule is that a class can extend a maximum of one class only.
When a class extends another class, it can override the methods defined in a superclass.
We also use the extends keyword when we want an interface to extend or inherit another interface.


Implements:
>> We use the keyword implements while implementing an interface.
A class can implement an interface using the implements keyword.
An interface is an abstract type in Java that contains a collection of abstract methods. We cannot instantiate an interface that is, we can???t create objects from an interface.
When a class implements an interface, it has to define all the methods that are present inside the interface by providing the implementation of each of the methods.
If the class that implements an interface, doesn???t define or does not contains implementation of all the methods of the interface, then we must declare it as abstract. Otherwise, the compiler will give an error.
Java doesn???t support multiple inheritances, but we can implement multiple inheritance in our code by using multiple interfaces in Java.
An interface can never implement another interface. The reason is that if the interface will implement another interface then it has to define all the methods of the interface which it is implementing but the interface can not have any concrete methods, therefore, an interface can???t implement another interface in Java.

- Both of them directly or indirectly use the concept of inheritance in Java.
- Implementing an interface provides more flexibility than extending a class as we can extend a single class but we can implement multiple inheritances in Java.

![compare](https://user-images.githubusercontent.com/83961643/161929847-6ba12b08-aba6-4699-8b07-c007ddb83965.jpeg)


## [Anonymous Inner Class](https://www.geeksforgeeks.org/anonymous-inner-class-java/)
Nested Classes in Java is prerequisite required before adhering forward to grasp about anonymous Inner class. It is an inner class without a name and for which only a single object is created. An anonymous inner class can be useful when making an instance of an object with certain ???extras??? such as overriding methods of a class or interface, without having to actually subclass a class.

- A single method interface: functional interface
- Takes 2 strings and returns a boolean
- You  can logically group code in one place
- increase encapsulation
- make your code more redable.

## String Analysis Regular class 
- Class ananlyses 

## String analysis Anonoymous Inner Class 

## Encapsulate the for Loop


# Chapter 7: Generics and Collections 

## Ordering Collections
![800px-Java util Collection_hierarchy svg](https://user-images.githubusercontent.com/83961643/162386411-99fc9cad-d126-44bc-ae87-cb9cf3a73620.png)![1024px-Java util Map_hierarchy svg](https://user-images.githubusercontent.com/83961643/162386494-944c31ca-2c2e-4ab8-9d8f-6979d61e7dd8.png)

## [Comparator](https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html)
[Comparator Interface in Java with Examples](https://www.geeksforgeeks.org/comparator-interface-java/)

# Chapter 8: Collections, Streams & Filters 

## Builder Pattern 

## [Predicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html)
The predicate is a predefined functional interface in Java defined in the java.util.Function package. It helps with manageability of code, aids in unit-testing, and provides various handy functions. - [More](https://www.educative.io/edpresso/what-is-a-java-predicate)


# Chapter 9: Lambda Built-in Functional Interfaces 

## Predicate 

## Consumer

## Function 

## Supplier

## Primitive Interface

## Binary Type 

## Unary Operator 


# Chapter 10: Lambda Operations 

## Difference between groupBy and groupingBy:
??? groupBy:

returns a Map object
changes the values by valueTransform
allows to pass a destination object to get mutable Map as result
??? groupingBy:

returns a Grouping object
doesn???t have valueTransform, so it changes the values by Grouping method such as eachCount(), fold(), reduce(), aggregate()???
doesn???t provide simple way to return a mutable Map

[More](https://www.bezkoder.com/kotlin-groupby-groupingby-example/)

# Chapter 11: Exceptions and Assertions

## Error Handeling

## Exception

## try-catch Statement 
Used to handle exceptions

- The catch clause
- finally Clause

## Assertions

# Chapter 12: Java Date/Time API 
[More from the Docs](https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html)

![datetimejava](https://user-images.githubusercontent.com/83961643/162715845-0c120112-726f-4766-bb01-e0caf73a87e0.jpeg)


# Chapter 13: Java I/O Fundamentalts


# Lesson 14: File I/O (NIO.2)

## Managing Metadata:![metadata](https://user-images.githubusercontent.com/83961643/162918889-60eabbcf-41b7-4948-91d7-0f021b3aea3d.jpeg)


# Lesson 15: Concurrency

# Lesson 16: Fork-Join Framework

## Parallelism and without Parallelism

## Work-Stealing

# Lesson 17: Parrellel Streams

## Streams 

## Pipelines 

## Statefullness

# Lesson 18: Building Database Applications with JDBC 

## CRUD operations

## Locale

# Lesson 19: Localization

# Lesson 20: Oracle Cloud

# Lesson 21: Oracle Application Container Cloud Service Overview

LAST EDIT: May 2022
