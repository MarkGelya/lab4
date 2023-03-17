package Persons;

import java.util.ArrayList;
import java.util.Arrays;

import Skills.Skill;

public class Group {
    private String name;
    private ArrayList<AbsPerson> persons = new ArrayList<AbsPerson>();
    public Group(String name, AbsPerson... persons) {
        this.name = name;
        this.persons.addAll(Arrays.asList(persons));
    }
    public void useSkill(Skill skill) {
        for (AbsPerson person : persons) {
            person.useSkill(skill);
        }
    }
}
