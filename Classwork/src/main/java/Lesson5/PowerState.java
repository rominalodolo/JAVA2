package Lesson5;

public enum PowerState {
    ON("The power usage is high."),
    OFF("The power usage is off."),
    SUSPENDED("The power usage is low.");

    private String description;
    private PowerState(String d){
        description = d;
    }
    public String getDescription() {
        return description;
    }
}
