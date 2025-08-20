import java.util.Random;
import org.hogwarts.hogwarts.school.Student;
import org.hogwarts.hogwarts.beast.Hippogriff;
import org.hogwarts.hogwarts.Items.Car;
import org.hogwarts.hogwarts.Items.Cloak;

public class Main {

    public static void main(String[] args) {
        Hippogriff noParamsHippo = new Hippogriff();
        Hippogriff allParamsHippo = new Hippogriff(
                "Jastin",
                5,
                "chestnut",
                "self-suction");
        Hippogriff twoParamsHippo = new Hippogriff("Duglas", "red");
        Hippogriff oneParamsHippo = new Hippogriff("Wylsacom");
        noParamsHippo.setName("Nameless");

        Student student = new Student(
                "Harry Potter",
                "Gryffindor",
                19,
                new String[]{"forbidden spells"});

        Car car = new Car(student, 45, true);

        if (car.isFlying) {
            car.becomeInvisible();
        } else {
            car.becomeVisible();
        }

        Cloak cloak = new Cloak(2, 1);

        boolean hasPeopleUnderCloak = true;

        if (hasPeopleUnderCloak) {
            cloak.becomeInvisible();
        } else {
            cloak.becomeVisible();
        }
    }
}