package Lesson8;

import java.util.List;

public class RoboMailTest01 {
    public static void main(String[] args) {

        List<Employee> pl = Employee.createShortList();
        RoboMail01 robo = new RoboMail01();


        System.out.println("\n==== RoboMail 01");
        System.out.println("\n=== Male Eng Under 65");
        pl.stream()
                .filter(p -> p.getGender().equals(Gender.MALE))
                .filter(p -> p.getDept().equals("Eng"))
                .filter(p -> p.getAge() < 65)
                .forEach(p -> robo.roboMail(p));
    }
}
