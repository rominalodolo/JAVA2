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

Class cast exeption: 
instanceof 

