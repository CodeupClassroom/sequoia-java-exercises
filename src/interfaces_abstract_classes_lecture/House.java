package interfaces_abstract_classes_lecture;

public class House extends PrivateBuilding implements Rentable, ClimateControllable {

    protected String schoolDistrict;
    protected int numberOfResidents;

    @Override
    public void adjustHeating() {
        System.out.println("Setting temperature of central heating unit.");
    }

    @Override
    public void adjustInsulation() {
        System.out.println("Sealing all windows and wrapping pipes");
    }

    @Override
    public void transferOwners() {
        System.out.println("Handing over keys");
        System.out.println("Sharing HOA secrets...");
    }

    @Override
    protected void measureSquareFeet() {
        System.out.println("returning width times length");
    }

    @Override
    protected void demolish() {
        System.out.println("Dismantling home");
    }

    @Override
    public String getCurrentRenterInfo() {
        return "Current house renter is called Dan Smith";
    }
}
