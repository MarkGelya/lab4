package Things;

public class Container extends Thing {
    Thing[] things;
    public Container(String name, Thing[] thing) {
        super(name);
        this.things = thing;
    }
}
