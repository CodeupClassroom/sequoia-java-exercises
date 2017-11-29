package inheritance_polymorphism_lecture;

public class Yacht extends Vehicle {

     public int depthOfWaters;

     public boolean isDocked;

     // creating a new constructor
     public Yacht(int maxSpeed) {
         super(maxSpeed); // using old constructor
         this.isDocked = true;
     }

     // overriding from parent
     public void turnOn() {
         System.out.println("...engaging propeller");
     }

}
