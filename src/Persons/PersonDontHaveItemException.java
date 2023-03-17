package Persons;

import Things.IItem;
public class PersonDontHaveItemException extends RuntimeException{

    private AbsPerson person;
    private IItem item;
    public AbsPerson getPerson() { return person; }
    public IItem getItem() { return item; }
    public PersonDontHaveItemException(AbsPerson person, IItem item){
        super(person + " don't have " + item);
        this.person = person;
        this.item = item;
    }
}