package org.hogwarts.hogwarts.school;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Spell {

    private String title;
    private int power;

    public Spell(String title, int power) {
        this.title = title;
        setPower(power);
    }

    public void setPower(int power){
        if (power >= 1 && power <= 7) {
            this.power = power;
        } else {
            throw new IllegalArgumentException("The spell's power should be between 1 and 7");
        }
    }
}
