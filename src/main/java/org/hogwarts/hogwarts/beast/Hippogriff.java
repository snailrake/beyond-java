package org.hogwarts.hogwarts.beast;
import java.util.Random;
import org.hogwarts.hogwarts.school.Student;

public class Hippogriff {
    String name;
    int age;
    String skinColor;
    String specialSkill;

    public Hippogriff(String name, int age, String skinColor, String  specialSkill) {
        this.name = name;
        this.age = age;
        this.skinColor = skinColor;
        this.specialSkill = specialSkill;
    }

    public Hippogriff(String name) {
        this.name = name;
    }

    public Hippogriff(String name, String skinColor) {
        this.name = name;
        this.skinColor = skinColor;
    }

    public Hippogriff() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public String getSpecialSkill() {
        return specialSkill;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String eat(String food) {
        if (food.equalsIgnoreCase("fish") || food.equalsIgnoreCase("meat")) {
            return name + " eats with pleasure " + food;
        } else {
            return name + " refuses to eat " + food + " and defiantly turns away";
        }
    }

    public String fly() {
        if (age > 2) {
            return name + " it takes off!";
        } else {
            return name + " still too young to fly..";
        }
    }

    public String giveRide(Student student) {
        Random random = new Random();
        int isGivingRide = random.nextInt(1,11);

        if (isGivingRide >= 1 && isGivingRide <= 3) {
            return student.getName() + " flying on a hippogriff " + name;
        } else if (isGivingRide >= 4 && isGivingRide <= 8) {
            return name + " defiantly turns away and refuses to fly with " + student.getName();
        } else {
            return student.getName() + ", try to persuade me again " + name + " take a ride";
        }
    }
}
