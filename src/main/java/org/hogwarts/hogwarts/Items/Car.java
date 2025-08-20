package org.hogwarts.hogwarts.Items;

import org.hogwarts.hogwarts.school.Student;

public class Car implements Invisible{

    public Student driver;
    public int speed;
    public boolean isFlying;

    public Car(Student driver, int speed, boolean isFlying) {
        this.driver = driver;
        this.speed = speed;
        this.isFlying = isFlying;
    }

    public void becomeInvisible() {
        System.out.println("The car is invisible");
    }

    public void becomeVisible() {
        System.out.println("The car is visible");
    }
}
