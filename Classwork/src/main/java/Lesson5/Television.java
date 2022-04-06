package Lesson5;

public class Television extends ElectronicDevice{
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
