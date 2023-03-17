package Skills;

import Persons.AbsPerson;

public class ApproveSkill implements Skill {
    private AbsPerson person;
    private String text;
    public ApproveSkill(String text) {
        this.text = text;
    }
    @Override
    public void exec(AbsPerson person) {
        System.out.println(person.name  + " утверждает: \"" + text + "\".");
    };
}
