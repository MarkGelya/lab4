package Skills;

import Persons.AbsPerson;
import Persons.Person;
import Things.IThing;

public class GoToSkill implements Skill {
    public Object obj;
    public GoToSkill(Object thing) {
        this.obj = thing;
    }
    public void exec(AbsPerson person) {
        if (obj instanceof Person) {
            System.out.println(person.name  + " подошёл к " + ((Person)obj).getName() + ".");
            person.setPosition(((Person)obj).getPosition());
        } else if (obj instanceof IThing) {
            System.out.println(person.name  + " подошёл к " + ((IThing)obj).getName() + ".");
            person.setPosition(((IThing)obj).getPosition());
        }
        else {
            throw new RuntimeException("");
        }

    };
}
