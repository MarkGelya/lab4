package Skills;

import Persons.AbsPerson;

public class GameSkill implements MPSkill {
    private final String name;
    public GameSkill(String name) {
        this.name = name;
    }

    @Override
    public void exec(AbsPerson person) {
        System.out.printf("%s играет в %s\n", person.getName(), name);
    };

    @Override
    public void exec(AbsPerson[] persons) {
        if (persons.length == 0) {
            throw new RuntimeException("person.len == 0");
        } else if (persons.length == 1) {
            exec(persons[0]);
        }
        String persons_name = "";
        for (int i = 0; i < persons.length-1; i++) {
            persons_name += ", " + persons[i].getName();
        }
        persons_name += " и " + persons[persons.length-1].getName();
        System.out.printf("%s играют в %s\n", persons_name, name);
    };
}
