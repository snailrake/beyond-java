package org.hogwarts.hogwarts.Items;

public class Cloak implements Invisible{

    public int capacity;
    public int weight;

    public Cloak(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public void becomeInvisible() {
        System.out.println("The people who are now under the cloak are not visible");
    }

    public void becomeVisible() {
        System.out.println("The people who are now under the cloak are visible.");
    }

}
