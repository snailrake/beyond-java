package lesson5;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        String[] recipe = {"Bitten basilisk scales", "A piece of the forest fairy's soul",
                "A drop of vampire rose juice", "The poison of the rough-skinned viper",
                "A fragment of a comet", "The phoenix's tear"};

        String[] portion = new String[6];

        portion[2] = "A drop of vampire rose juice";
        portion[5] = "The phoenix's tear";
        portion[0] = "Bitten basilisk scales";
        portion[1] = "A piece of the forest fairy's soul";
        portion[3] = "The poison of the rough-skinned viper";
        portion[4] = "A fragment of a comet";

        if (Arrays.equals(recipe, portion)) {
            System.out.println("The potion was brewed successfully!");
        } else {
            System.out.println("The potion didn't work, try again.");
        }

        Lesson5 lesson5 = new Lesson5();
        lesson5.prepare();

        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("The smallest element: " + min);
        System.out.println("The largest element: " + max);
    }

    public void prepare() {
        Scanner scanner = new Scanner(System.in);

        String[] ingredients = {
                "Dragon claw",
                "Mandrake Leaf",
                "Root of the rough astrelia"
        };

        System.out.println("Welcome to the Potion Lab!");
        System.out.println("Enter the ingredients you have (separated by commas):");

        String input = scanner.nextLine();
        String[] userIngredients = input.split(",");

        int foundCount = 0;
        for (String required : ingredients) {
            for (String userIngredient : userIngredients) {
                if (required.equals(userIngredient)) {
                    foundCount++;
                    break;
                }
            }
        }

        if (foundCount == ingredients.length) {
            System.out.println("You have all the necessary ingredients for the potion! You can start creating it.");
        } else {
            System.out.println("You are missing some ingredients. You cannot start creating the potion.");
        }
    }
}
