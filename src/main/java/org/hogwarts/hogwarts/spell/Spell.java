package org.hogwarts.hogwarts.spell;

import lombok.Getter;

@Getter
public abstract class Spell {
    private String name;
    private String effect;
    private boolean isForbidden;

    public Spell(String name, String effect, boolean isForbidden) {
        this.name = name;
        this.effect = effect;
        this.isForbidden = isForbidden;
    }

    public abstract void doMagic();

    public String toString() {
        return "Spell: " +
                "name ='" + name + ';' +
                ", effect ='" + effect + ';' +
                ", is forbidden =" + isForbidden;
    }
}