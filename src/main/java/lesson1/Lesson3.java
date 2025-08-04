package lesson1;

import java.util.Random;

public class Lesson3 {
    public static void main(String[] args) {
        int randomNum1 = new Random().nextInt(0, 10);
        int randomNum2 = new Random().nextInt(0, 10);

        if (randomNum1 % 2 == 0 && randomNum2 % 2 == 0){
            int sum = randomNum1/2 + randomNum2/2;
            System.out.println(sum);
        } else if (randomNum1 % 2 == 0 && randomNum2 % 2 != 0){
            int sum = randomNum1/2 + randomNum2;
            System.out.println(sum);
        } else if (randomNum2 % 2 == 0 && randomNum1 % 2 != 0) {
            int sum = randomNum2/2 + randomNum1;
            System.out.println(sum);
        } else {
            int sum = randomNum1+randomNum2;
            System.out.println(sum);
        }
    }
}
