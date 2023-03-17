package Skills;

import Persons.AbsPerson;
import Persons.PersonDontHaveItemException;
import Things.IItem;
public class ToHendSkill implements Skill {
    private final AbsPerson person;
    private final IItem item;
    public ToHendSkill(AbsPerson person, IItem item) {
        this.person = person;
        this.item = item;
    }
    @Override
    public void exec(AbsPerson person) {
        if (this.person.items.contains(item)) {
            this.person.items.remove(item);
            person.items.add(item);
            System.out.printf("%s положил в руку %s %s\n", person, this.person, item);
        }
        else {
            throw new PersonDontHaveItemException(person, this.item);
        }
    }
}