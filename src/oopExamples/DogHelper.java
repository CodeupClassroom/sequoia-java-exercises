package oopExamples;

public class DogHelper {

    public static int numberOfDogBreeds = 340;

    public static int numberOfDogs = 52000000;

    public static double humanToDogYears(double years) {
        return years * 7;
    }

    // method to convert weight of dog in pounds to weight of food in grams
    public static double amoundOfFoodCalculator(double dogWeightInPounds) {
        return dogWeightInPounds * 6;
    }

}
