package ark;

import util.Input;

import java.util.ArrayList;


/**
 * NOTE: This ark does not ensure that there are only two animal of each type.
 */
public class ArkApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to the Ark!");

        // plain ol' Java array
        // Animal[] animals = new Animal[12];
        ArrayList<Animal> animals = new ArrayList<>();

        // get 11 random animals.
        for(int i = 0; i < 4000; i++) {
            animals.add(getRandomAnimal());
        }

        // now for the 12th animal, the user gets to decide!
        animals.add(getAnimalFromUser());
        animals.add(getAnimalFromUser());
        animals.add(getAnimalFromUser());
        animals.add(getAnimalFromUser());
        animals.add(getAnimalFromUser());

        showAllAnimals(animals);
    }

    public static void showAllAnimals(ArrayList<Animal> animals) {
        for(Animal animal : animals) {

            animal.soundOff();
        }

        System.out.println("In total, we have " + Animal.getTotalNumberOfAnimals());

        System.out.println(animals.get(0).getName() + " and " + animals.get(0).getNumberOfThisAnimal());
    }


    public static Animal getAnimalFromUser() {
        Input input = new Input();
        int userInput;
        Animal userSelectedAnimal;

        System.out.println("What kind of animal would you like to create?");
        System.out.println("1 - cat!");
        System.out.println("2 - elephant");
        System.out.println("3 - goose!");
        System.out.println("4 - Lion");
        System.out.println("5 - Unicorn!");
        userInput = input.getInt(1, 5);

        userSelectedAnimal = animalSelector(userInput);
        return userSelectedAnimal;

    }

    public static Animal getRandomAnimal() {
        Animal animal;

        int randomNumber = (int) Math.ceil(Math.random() * 5);

        animal = animalSelector(randomNumber);

        return animal;

    }

    public static Animal animalSelector(int number) {
        Animal animal;

        if(number == 1) {
            animal = new Cat();
        } else if (number == 2) {
            animal = new Elephant();
        } else if (number == 3) {
            animal = new Goose();
        } else if (number == 4) {
            animal = new Lion();
        } else {
            animal = new Unicorn();
        }

        return animal;
    }
}
