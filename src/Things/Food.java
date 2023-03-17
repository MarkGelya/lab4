package Things;

public class Food extends Thing implements IFood {
    private int foodScore;
    private int temperature = 20;
    public Food(String name, int foodScore) {
        super(name);
        this.foodScore = foodScore;
    }
    public int eat() {
        return this.foodScore;
    }
    public int changeTemperature(int dif) {
        if (dif < 0) {
            System.out.printf("%s остыла на %d°C \n", getName(), -1*dif);
        }
        if (dif > 0) {
            System.out.printf("%s нагрелась на %d°C градусов\n", getName(), dif);
        }
        temperature += dif;
        return temperature;
    }
    public int getTemperature() {
        return temperature;
    }
    public void setFoodScore(int foodScore) {
        this.foodScore = foodScore;
    }
    public void addFoodScore(int foodScore) {
        this.foodScore += foodScore;
    }
}
