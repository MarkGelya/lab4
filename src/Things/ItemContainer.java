package Things;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemContainer extends AbsThing implements IItem {
    IItem[] things;
    public ItemContainer(String name, IItem... thing) {
        super(name);
        this.things = thing;
    }

    public ArrayList<IItem> getList() {
        ArrayList<IItem> lst = new ArrayList<IItem>();
        for (IItem item : things) {
            lst.add(item);
        }
        return lst;
    }

    @Override
    public String toString() {
        return "Item " + this.getName();
    }
}

