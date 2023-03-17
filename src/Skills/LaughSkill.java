package Skills;

import Persons.AbsPerson;

public class LaughSkill implements Skill {
    public void exec(AbsPerson person) {
        System.out.println(person.name + " смеётся");
    };
}
