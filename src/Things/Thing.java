package Things;

import Persons.*;

public class Thing extends AbsThing {
    public Thing(String name) {
        super(name);
    }
    public Thing(String name, Position pos) {
        super(name);
        super.setPosition(pos);
    }
    @Override
    public String toString() {
        return "BaseThing " + this.getName();
    }
}