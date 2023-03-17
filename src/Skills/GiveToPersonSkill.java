package Skills;

import Persons.AbsPerson;
import Persons.PersonDontHaveItemException;
import Things.IItem;

public class GiveToPersonSkill implements Skill{
    private final AbsPerson person;
    private final IItem item;
    public GiveToPersonSkill(AbsPerson person, IItem item) {
        this.person = person;
        this.item = item;
    }
    @Override
    public void exec(AbsPerson person) {
        if (person.items.contains(item)) {
            this.person.items.add(item);
            person.items.remove(item);
            System.out.printf("%s дал %s %s\n", person, this.person, item);
        }
        else {
            throw new PersonDontHaveItemException(person, this.item);
        }
    }
}
