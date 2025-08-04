package lesson1;

import java.util.Random;

public class Lesson1 {
    public static void main(String[] args) {

        String dumbledore = "Dumbledore",
                mcgonagall = "I still don't know who the fuck it is.",
                snape = "Snape",
                lipun = "Lipun",
                hugrid = "Hugrid";

        String teacher = "school teachers: ";

        System.out.println(String.format("%s %s, %s, %s, %s, %s",teacher,dumbledore,mcgonagall,snape,lipun,hugrid));

        int grade1 = new Random().nextInt(1, 12);
        int grade2 = new Random().nextInt(1, 12);

        System.out.println(String.format("Grades: %d & %d", grade1, grade2));
        boolean result = grade1 > 5 && grade2 > 5;
        System.out.println("Result: " + result);

        double avg = (grade1 + grade2) / 2;
        System.out.println("Avg grade: " + avg);

        int mod = 4199 % 13 + 4199 % 14 + 4199 % 15 + 4199 % 16 + 4199 % 17 + 4199 % 19;
        System.out.println("Mod = " + mod);
    }
}
