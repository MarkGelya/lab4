package Persons;

import java.util.ArrayList;
import java.util.Collections;

import Things.*;
import Skills.*;

public abstract class AbsPerson {
    public String name;
    public ArrayList<IItem> items = new ArrayList<IItem>();
    public ArrayList<Status> status = new ArrayList<Status>();
    public Location location;

    private IItem hend;
    private Position pos = Position.NONE;

    public AbsPerson(String name) {
        this.name = name;
    }
    public AbsPerson(String name, IItem[] items) {
        this.name = name;
        Collections.addAll(this.items, items);
    }
    public void setPosition(Position pos) {
        this.pos = pos;
    }
    public Position getPosition() {
        return pos;
    }

    public String getName() {
        return name;
    }
    public boolean isAmong(AbsThing thing) {
        return thing.getPosition().equals(pos);
    }
    @Override
    public int hashCode() {
        return super.hashCode() + this.name.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person))
            return false;
        Person person = (Person)obj;
        return (this.name.equals(person.name)) && (person.hashCode() == this.hashCode());
    }
    @Override
    public String toString() {
        return "AbsPerson " + this.name;
    }
    public void setStatus(Status status) {
        this.status.add(status);
        System.out.println(name + " теперь " + this.status.toString());
    }
    public Status getStatus() {
        return status.get(status.size()-1);
    }

    public boolean hasStatus(Status status) {
        return this.status.contains(status);
    }
    public void useSkill(Skill skill) {
        skill.exec(this);
    }
    public IItem getHend() {
        return hend;
    }
    public void setHend(IItem item) {
        if (items.contains(item)) {
            hend = item;
        }
        else {
            throw new RuntimeException("Person don't have this item");
        }
    }
}
