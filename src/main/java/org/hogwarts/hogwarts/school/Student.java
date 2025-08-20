package org.hogwarts.hogwarts.school;

import lombok.Getter;

@Getter
public class Student {

    private String name;
    private String faculty;
    private int age;
    private String[] specialSkills;


    public Student(String name, String faculty, int age, String[] specialSkills) {
        if (age >= 11) {
            if (specialSkills.length > 3) {
                throw new IllegalArgumentException("Student can have maximum 3 special skills");
            } else {
                this.name = name;
                this.faculty = faculty;
                this.age = age;
                this.specialSkills = specialSkills;
            }
        } else {
            throw new IllegalArgumentException("You can only enroll in Hogwarts from the age of 11 or more");
        }
    }

    public void castSpell (Spell spell){
        int maxSpellPower = age - 10;
        if (spell.getPower() > maxSpellPower) {
            throw new SpellCastException(this.name + " still too young to use a spell " + spell.getTitle());
        }
        System.out.println(this.name + " use spell " + spell.getTitle());
    }
}
