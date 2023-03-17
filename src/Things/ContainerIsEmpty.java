package Things;

public class ContainerIsEmpty extends Exception{
    private AbsThing thing;
    public ContainerIsEmpty(AbsThing thing){
        super(thing + " is empty!");
        this.thing = thing;
    }
}