package Things;

import Persons.*;

public abstract class AbsThing implements IThing {
    public String name;
    private Position pos = Position.NONE;
    public AbsThing(String name) {
        this.name = name;
    }
    public void setPosition(Position pos) {
        this.pos = pos;
    }
    public Position getPosition() {
        return pos;
    }
    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }
    @Override
    public String toString() {
        return "Thing " + this.getName();
    }
    public String getName() {
        return name;
    }
}
