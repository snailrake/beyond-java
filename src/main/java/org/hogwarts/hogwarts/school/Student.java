package org.hogwarts.hogwarts.school;

public class Student {

    String name;
    String faculty;
    int age;
    String[] specialSkills;

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

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getAge() {
        return age;
    }

    public String[] getSpecialSkills() {
        return specialSkills;
    }
}
