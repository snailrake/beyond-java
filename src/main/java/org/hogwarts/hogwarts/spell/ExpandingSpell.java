package org.hogwarts.hogwarts.spell;

public class ExpandingSpell extends Spell {

    public ExpandingSpell(String name, String effect, boolean isForbidden) {
        super(name, effect, isForbidden);
    }

    public void doMagic() {
        System.out.println("A magnification spell was cast: " + getName());
        System.out.println("Effect: " + getEffect());
        if (isForbidden()) {
            System.out.println("Status: Allowed");
        } else {
            System.out.println("Status: Forbidden");
        }
    }
}