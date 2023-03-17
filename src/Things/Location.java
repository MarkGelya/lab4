package Things;

import java.util.ArrayList;

import Persons.*;

public class Location extends AbsThing {
    public ArrayList<AbsThing> things = new ArrayList<AbsThing>();
    public ArrayList<Person> persons = new ArrayList<Person>();
    public Location(String name) {
        super(name);
    }
    @Override
    public String toString() {
        String listThings = "";
        String listPersons = "";
        for (AbsThing thing: this.things) {
            listThings += thing.toString() + " ";
        }
        for (Person person: this.persons) {
            listPersons += person.name + " ";
        }
        if (this.things.isEmpty()) {
            return name;
        }
        else {
            return name + " содержит: " + listThings;
        }
    }
}
