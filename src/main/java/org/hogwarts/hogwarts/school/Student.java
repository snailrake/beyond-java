package org.hogwarts.hogwarts.school;

public class Student {

    String name;
    String faculty;
    int age;
    String[] specialSkills;

    public Student(String name, String faculty, int age, String[] specialSkills) {
        if (age >= 11) {
            if (specialSkills.length > 3) {
                System.out.println("Student can have maximum 3 special skills");
            } else {
                this.name = name;
                this.faculty = faculty;
                this.age = age;
                this.specialSkills = specialSkills;
            }
        } else {
            System.out.println("You can only enroll in Hogwarts from the age of 11 or more");
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

    public void castSpell (Spell spell){
        int maxSpellPower = age - 10;
        if (spell.getPower() > maxSpellPower) {
            throw new SpellCastException(this.name + " still too young to use a spell " + spell.getTitle());
        }
        System.out.println(this.name + " use spell " + spell.getTitle());
    }
}