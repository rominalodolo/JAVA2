# JAVA2
 Java advanced Classwork and activities.


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


## Modeling Business Problems with Classes

![img](https://user-images.githubusercontent.com/83961643/161742340-72c9af1b-51e3-4361-970f-36ce9707bd87.jpeg)

>> Always use the most generic reference type possible. <<

