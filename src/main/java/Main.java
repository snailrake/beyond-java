import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Harry Potter", "Gryffindor", 17,
                new String[]{"Quidditch", "Defense against the Dark Arts"}));
        students.add(new Student("Hermione Granger", "Gryffindor", 18,
                new String[]{"Magic", "Study", "Bitch"}));
        students.add(new Student("Draco Malfoy", "Slytherin", 17,
                new String[]{"Potions making", "Flights"}));
        students.add(new Student("Luna Lovegood", "Ravenclaw", 16,
                new String[]{"Magical creatures", "Creation"}));
        students.add(new Student("Cedric Diggory", "Hufflepuff", 18,
                new String[]{"Quidditch", "Honesty"}));

        System.out.println("The original list of students:");
        printStudents(students);

        Collections.sort(students);
        System.out.println("Sort by ascending age:");
        printStudents(students);

        Comparator<Student> nameComparator = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        };

        Collections.sort(students, nameComparator);
        System.out.println("Sorting by alphabetical name order:");
        printStudents(students);

        Comparator<Student> facultyComparator = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s2.getFaculty().compareTo(s1.getFaculty());
            }
        };

        Collections.sort(students, facultyComparator);
        System.out.println("Sorting by alphabetical descending order of faculty:");
        printStudents(students);
    }

    private static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}