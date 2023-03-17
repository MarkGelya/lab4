package Things;

public class Lamp extends AbsThing {
    private int power = 255;
    public Lamp(int power) {
        super("Лампа");
        this.power = power % 256;
    }
    int getPower() { return this.power; }
    String getStrPower() {
        if (power == 0) {
            return "Выключена";
        } else if (power < 100) {
            return "Тускло светит";
        } else {
            return "Ярко светит";
        }
    };
}
