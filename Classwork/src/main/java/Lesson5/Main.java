package Lesson5;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer();
        System.out.println("Current state: ");
        comp.setState(PowerState.ON);
    }
}
