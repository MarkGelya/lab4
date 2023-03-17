package Skills;

import Persons.AbsPerson;
import Persons.PersonDontHaveItemException;
import Things.IItem;

public class GetAtPersonSkill implements Skill{
    private final AbsPerson person;
    private final IItem item;
    public GetAtPersonSkill(AbsPerson person, IItem item) {
        this.person = person;
        this.item = item;
    }
    @Override
    public void exec(AbsPerson person) {
        if (this.person.items.contains(item)) {
            person.items.add(item);
            this.person.items.remove(item);
            System.out.printf("%s взял у %s %s", this.person, person, item);
        }
        else {
            throw new PersonDontHaveItemException(this.person, this.item);
        }
    }
}

