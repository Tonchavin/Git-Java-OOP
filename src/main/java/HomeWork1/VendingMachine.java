package HomeWork1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    List<HotDrinks> drinks;

    public VendingMachine() {
        drinks = new ArrayList<>();
    }

    public HotDrinks getProduct(String name, double volume, double temperature) {
        for (HotDrinks d : drinks) {
            if (d.getName().equals(name) && d.getVolume() == volume) {
                return d;
            }
        }
        return null;
    }

    public void addDrinks(HotDrinks d) {
        drinks.add(d);
    }
}
