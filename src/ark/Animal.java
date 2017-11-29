package ark;

public class Animal {
    private String kingdom = "animal";
    protected String name;
    protected String sound;
    protected static int totalNumberOfAnimals;
    protected int numberOfThisAnimal;

    public Animal(String name) {
        this.name = name;
        totalNumberOfAnimals++;
    }

    public void soundOff() {
        System.out.println("The " + this.name + " goes " + this.sound);
    }

    public String getKingdom() {
        return kingdom;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public static int getTotalNumberOfAnimals() {
        return totalNumberOfAnimals;
    }

    public int getNumberOfThisAnimal() {
        return numberOfThisAnimal;
    }
}
