package HomeWork1;

public class HotDrinksTemperature extends HotDrinks {
    static int temperature;

    public HotDrinksTemperature(String name, double volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
