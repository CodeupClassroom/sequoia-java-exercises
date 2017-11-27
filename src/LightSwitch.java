
public class LightSwitch {
    // what does this object need to do?
    // what does this object need to communicate about itself or its values
    // communicate if the switch is on or off
    // turn on or turn off or toggle

    private boolean isOn;

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void flip() {
       if(this.lightIsOff()) {
           turnOn();
       } else {
           turnOff();
       }
    }

    public boolean lightIsOn() {
        return this.isOn;
    }

    public boolean lightIsOff() {
        return !this.isOn;
    }

}
