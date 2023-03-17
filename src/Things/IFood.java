package Things;

public interface IFood extends IItem {
    int changeTemperature(int dif);
    int getTemperature();
    String getName();
    void setFoodScore(int foodScore);
    int eat();
}
