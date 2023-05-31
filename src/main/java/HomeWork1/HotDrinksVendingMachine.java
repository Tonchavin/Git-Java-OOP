package HomeWork1;

public class HotDrinksVendingMachine extends VendingMachine {
    @Override
    public HotDrinks getProduct(String name, double volume, double temperature) {
        for (HotDrinks d : drinks) {
            if (d instanceof HotDrinksTemperature) {
                HotDrinksTemperature ht = (HotDrinksTemperature) d;
                if (ht.getName().equals(name) && ht.getVolume() == volume && ht.getTemperature() == temperature) {
                    return ht;
                }
            }
        }
        return null;
    }
}
