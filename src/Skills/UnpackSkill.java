package Skills;

import Persons.AbsPerson;
import Things.IItem;
import Things.ItemContainer;

public class UnpackSkill implements Skill {
    private final ItemContainer iContainer;
    public UnpackSkill(ItemContainer iContainer) {
        this.iContainer = iContainer;
    }
    @Override
    public void exec(AbsPerson person) {
        if (person.items.contains(iContainer)) {
            person.items.addAll(iContainer.getList());
        }
        else {
            throw new RuntimeException("Person don't have item");
        }
    }
}
