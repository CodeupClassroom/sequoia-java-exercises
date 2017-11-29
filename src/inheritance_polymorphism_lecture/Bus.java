package inheritance_polymorphism_lecture;

public class Bus extends Vehicle {

    public boolean headlightOn;

    // creating a new constructor
    public Bus(int maxSpeed) {
        super(maxSpeed); // using old constructor
        this.headlightOn = false;
    }

    public void honkHorn() {
        System.out.println("Honk HONK!!");
    }

    // overriding from parent
    public void turnOn() {
        System.out.println("...cranking engine");
    }

}