package inheritance_polymorphism_lecture;


public class Vehicle {

    private int numberOfOccupants;

    final private int maxSpeed; // keeps subclasses from changing this property

    // this default constructor is needed
    public Vehicle() {
        this.maxSpeed = 0;
    }

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void turnOn() {
        System.out.println("Starting...");
    }

    public int getNumberOfOccupants() {
        return numberOfOccupants;
    }

    public void setNumberOfOccupants(int numberOfOccupants) {
        this.numberOfOccupants = numberOfOccupants;
    }

}
