/**
 * Created by moon on 11/27/17.
 */
public class LightSwitchApp {
    public static void main(String[] args) {

        LightSwitch classroomSwitch = new LightSwitch();

        System.out.println("Good morning!");
        classroomSwitch.turnOn();

        if(classroomSwitch.lightIsOn()) {
            System.out.println("Ok, the light is turned on.");
        } else {
            System.out.println("light is still off.");
        }
        System.out.println("do class stuff in the light");

        System.out.println("end of day, turn off the lights");
        classroomSwitch.turnOff();
    }
}
