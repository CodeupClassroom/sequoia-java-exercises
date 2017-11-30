package interfaces_abstract_classes_lecture;

public abstract class PrivateBuilding extends Building {

    public static void mortgageCalculator() {
        System.out.println("You will pay a lot. :(");
    }

    protected String owner;
    protected String[] pastOwners;
    protected String address;
    public abstract void transferOwners();

}
