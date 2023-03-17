package Skills;

import Persons.AbsPerson;

public class SaySkill implements Skill {
    private final String text;
    public SaySkill(String text) {
        this.text = text;
    }

    @Override
    public void exec(AbsPerson person) {
        System.out.printf("%s говорит \"%s\"\n", person.name, text);
    }
}
