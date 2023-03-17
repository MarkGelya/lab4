package Things;

import Persons.*;

public class Clothes extends Item implements Brokenable {
    private int strengthScore = 255;
    public Clothes(String name) {
        super(name);
    }

    @Override
    public void broke(int damage) {
        this.strengthScore -= Math.abs(damage);
    }

    @Override
    public int getStrength() {
        return strengthScore;
    }

    @Override
    public void repair(AbsPerson person) {

    }

    @Override
    public String toString() {
        return "Clothes " + this.getName();
    }
}
