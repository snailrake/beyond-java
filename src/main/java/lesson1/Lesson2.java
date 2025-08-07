package lesson1;

import java.util.Random;

public class Lesson2 {
    public static void main(String[] args) {

        Random random = new Random();
        StringBuilder lineWithNum = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            int randomnum = random.nextInt(10);
            lineWithNum.append(randomnum);
            if (i < 4) {
                lineWithNum.append("-");
            }
        }

        System.out.println("the resulting string: " + lineWithNum);

        String resultLine = lineWithNum.toString()
                .replace("-","")
                .replace("1","i")
                .replace("0","o")
                .replace("6","b");

        System.out.println("the line with the changes: " + resultLine);

        int a = lineWithNum.indexOf("23");
        if (a != -1){
            System.out.println("this line has a substring - 23");
        } else System.out.println("this line does not have a substring - 23");

        int a1 = lineWithNum.indexOf("ob");
        if (a1 != -1){
            System.out.println("substring index: "+a1);
        } else {
            System.out.println("there is no substring \"ob\"");
        }
    }

    public static String castSpell()
    {
        String spell = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA";
        String spellLowerCase = spell.toLowerCase();
        System.out.println(spellLowerCase);

        Random random = new Random();
        int randomindex = random.nextInt(spellLowerCase.length());//подменил значение рандома до длины строки ибо там может выйти за рамки)

        String substring = spellLowerCase.substring(randomindex);
        System.out.println(substring);

        StringBuilder spell1 = new StringBuilder(substring);
        spell1.reverse();
        String reverseSpell = spell1.toString();
        System.out.println(reverseSpell);

        if (reverseSpell.length() >= 2) {
            char zero = reverseSpell.charAt(0);
            char one = reverseSpell.charAt(1);
            reverseSpell = one + String.valueOf(zero) + reverseSpell.substring(2);
        }
        System.out.println(reverseSpell);
        return reverseSpell;
    }
}
