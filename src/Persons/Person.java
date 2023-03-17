package Persons;

import java.util.ArrayList;

import Things.*;
import Skills.*;

public class Person extends AbsPerson {
    public Person(String name) {
        super(name);
    }
    public Person(String name, IItem[] items) {
        super(name, items);
    }
    @Override
    public String toString() {
        return "Person " + this.name;
    }
}
