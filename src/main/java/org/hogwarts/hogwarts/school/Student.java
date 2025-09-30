package org.hogwarts.hogwarts.school;

import lombok.Getter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

@Getter
public class Student implements Comparable<Student>{

    private String name;
    private String faculty;
    private int age;
    private String[] specialSkills;


    public Student(String name, String faculty, int age, String[] specialSkills) {
        checkAgeAndSkills(age,specialSkills);

        this.name = name;
        this.faculty = faculty;
        this.age = age;
        this.specialSkills = specialSkills;
    }

    private void checkAgeAndSkills(int age, String[] skills) {
        if (age < 11) {
            throw new IllegalArgumentException("You can only enroll in Hogwarts from the age of 11 or more");
        }
        if (skills.length > 3) {
            throw new IllegalArgumentException("Student can have maximum 3 special skills");
        }
    }

    public void castSpell (Spell spell){
        int maxSpellPower = age - 10;
        if (spell.getPower() > maxSpellPower) {
            throw new SpellCastException(this.name + " still too young to use a spell " + spell.getTitle());
        }
        System.out.println(this.name + " use spell " + spell.getTitle());
    }

    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }

    public String toString() {
        return "Student name = " + name + ", age = " + age + ", faculty = " + faculty + ", skills = " +
                java.util.Arrays.toString(specialSkills);
    }
}