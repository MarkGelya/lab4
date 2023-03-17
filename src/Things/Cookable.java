package Things;

public interface Cookable extends IThing {
    void cook(IFood food);
    IFood extract() throws ContainerIsEmpty;
}
