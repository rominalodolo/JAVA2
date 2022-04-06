package Lesson5;

public abstract class ElectronicDevice {
    public void initialize() {
        System.out.println("Initializing...");
    }

    public void setState(PowerState state){
        switch(state){
            case ON:
                System.out.println(PowerState.ON);;
                break;
            case OFF:
                System.out.println(PowerState.OFF);;
                break;
            case SUSPENDED:
                System.out.println(PowerState.SUSPENDED);;
                break;

        }
    }
    public void getState(){

    }
    public abstract void turnOn();

    public abstract void turnOff();
}
