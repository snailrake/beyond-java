package org.hogwarts.hogwarts.school;

import lombok.Getter;

@Getter
public class Student {

    private String name;
    private String faculty;
    private int age;
    private String[] specialSkills;


    public Student(String name, String faculty, int age, String[] specialSkills) {
        if (specialSkills.length > 3) {
            System.out.println("Student can have maximum 3 special skills");
        } else {
            this.name = name;
            this.faculty = faculty;
            this.age = age;
            this.specialSkills = specialSkills;
        }
    }
}
