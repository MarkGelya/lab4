package Things;

import BookScripts.*;

public class Book extends Item {
    private String content;
    public BookScript bookScript;
    public Book(String name, BookScript bookScript) {
        super(name);
        this.bookScript = bookScript;
    }
    @Override
    public String toString() {
        return "Book " + this.getName();
    }
    public void read() {
        String name = super.name;
        if (this.name != "") {
            name = " \"" + super.name + "\"";
        }
        System.out.print("В книге" + name + " сказано: ");
        bookScript.exec();
    }
}
