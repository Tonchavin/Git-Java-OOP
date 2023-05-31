package HomeWork1;

public class HotDrinks {
    String name;
    double volume;

    public HotDrinks(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return String.format("Напиток:  %s, Объем: %s, Температура: %s" ,name, volume,HotDrinksTemperature.temperature);
    }
}