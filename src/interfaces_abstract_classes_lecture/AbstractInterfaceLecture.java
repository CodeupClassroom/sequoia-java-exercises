package interfaces_abstract_classes_lecture;

public class AbstractInterfaceLecture {

    public static void main(String[] args) {

        PrivateBuilding.mortgageCalculator(); // using static method

        // PrivateBuilding pb = new PrivateBuilding(); // won't work!

        // House extends Private Building
        House h = new House();
        h.transferOwners();

        // House extends PrivateBuilding which extends Building
        System.out.println(h.numberOfStories);
        System.out.println(h.getCurrentRenterInfo());

        // House implements Rentable extends PrivateBuilding which extends Building
        System.out.println(h.getCurrentRenterInfo());

        // House implements Rentable, ClimateControllable extends
        // PrivateBuilding which extends Building
        h.adjustHeating();
        h.adjustInsulation();
        System.out.println(h.MAX_SAFE_HUMAN_TEMP);

    }

}
