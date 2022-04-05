package Lesson4;


// testing static imports

import static java.lang.Math.random;

public class StaticTest {
    public static void main(String[] args) {
        double d = random();
        System.out.println("Random: " + d );
    }
}
