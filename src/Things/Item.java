package Things;

import Persons.*;

public class Item extends AbsThing implements IItem {
    public Item(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Item " + this.getName();
    }
}
