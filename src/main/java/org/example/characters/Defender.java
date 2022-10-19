package org.example.characters;

public class Defender extends Warrior {
    static final int ATTACK = 3;
    private int defence = 3;

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    @Override
    public int getAttack() {
        return ATTACK;
    }

    @Override
    public void getDamage(int damage) {
        if (damage > getDefence())
            setHealth(getHealth() - (damage - getDefence()));
    }
}
