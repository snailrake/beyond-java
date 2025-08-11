package SortingFolder;
import java.util.Scanner;

public class SortingHat {
    public static void main(String[] args) {
        SortingHat sortingHat = new SortingHat();
        sortingHat.sort();
    }

    public void sort(){
        Scanner scan = new Scanner(System.in);
        String question1 = "Do you prefer to work in a team? (yes/no)";
        String question2 = "Do you like solving puzzles? (yes/no)";
        String question3 = "Are you taking risks to achieve your goal? (yes/no)";
        String question4 = "Do you care about creatures and nature? (yes/no)";

        System.out.println(question1);
        String answer1 = scan.nextLine();
        System.out.println(question2);
        String answer2 = scan.nextLine();
        System.out.println(question3);
        String answer3 = scan.nextLine();
        System.out.println(question4);
        String answer4 = scan.nextLine();

        if (answer1.equalsIgnoreCase("yes")){
            if (answer3.equalsIgnoreCase("yes")){
                System.out.println("Gryffindor");
            } else if (answer4.equalsIgnoreCase("yes")){
                System.out.println("Hufflepuff");
            }
        } else if (answer2.equalsIgnoreCase("yes")){
            if (answer1.equalsIgnoreCase("yes")){
                System.out.println("Ravenclaw");
            } else if (answer3.equalsIgnoreCase("yes")){
                System.out.println("Ravenclaw");
            } else {
                System.out.println("Slytherin");
            }
        } else if (answer3.equalsIgnoreCase("yes")){
            System.out.println("Slytherin");
        } else {
            System.out.println("Hufflepuff");
        }
    }
}
