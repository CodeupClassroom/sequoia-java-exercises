package interfaces_abstract_classes_lecture;

public abstract class Building {

    protected int numberOfStories;
    protected double squareFeet;
    public void calculateValue() {
        System.out.println("costToBuild + productivity - maintenance");
    }
    protected abstract void measureSquareFeet();
    protected abstract void demolish();

}
