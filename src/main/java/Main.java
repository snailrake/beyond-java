import java.util.Random;
import org.hogwarts.hogwarts.school.Student;
import org.hogwarts.hogwarts.beast.Hippogriff;

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
    }
}
