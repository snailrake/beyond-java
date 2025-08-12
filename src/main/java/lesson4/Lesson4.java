package lesson4;

import java.util.Random;

public class Lesson4 {
    public static void main(String[] args) {
        Lesson4 lesson4 = new Lesson4();
        lesson4.getBalls();
        lesson4.playGame();

        int sum = 0;
        int start = 222;
        int end = 444;
        for (int i = start; i <= end; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void getBalls(){
        for (int i = 0; i<3; i++){
            System.out.print("A ball called has been launched: ");
            if (i == 1){
                System.out.println("Quaffle");
            } else if (i == 2) {
                System.out.println("Bludger");
            } else {
                System.out.println("Golden Snitch");
            }
        }
    }

    public void playGame(){
        Random random = new Random();
        while (true) {
            int control = random.nextInt(0,100);
            if (control == 99){
                System.out.println("The Snitch is caught!");
                break;
            } else {
                System.out.println(control);
            }
        }
    }
}
