package Lesson5;

public class Computer extends ElectronicDevice {
    @Override
    public void turnOn(){
        initialize();
        System.out.println("Turned On!");
    }
    @Override
    public void turnOff(){
        System.out.println("Turned Off!");
    }
}
