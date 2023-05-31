package HomeWork1;

public class Main {
    public static void main(String[] args) {
        HotDrinks drink1 = new HotDrinks("Coffee", 0.5);
        HotDrinks drink2 = new HotDrinks("Tea", 1);
        HotDrinks drink3 = new HotDrinksTemperature("Hot Milk", 1, 30);

        HotDrinksVendingMachine hdvm = new HotDrinksVendingMachine();
        hdvm.addDrinks(drink1);
        hdvm.addDrinks(drink2);
        hdvm.addDrinks(drink3);

        System.out.println(drink3);
        HotDrinks product = hdvm.getProduct("Hot Chocolate", 2.0, 40);

        if (product != null) {
            System.out.println("Product found: " + product.getName());
        } else {
            System.out.println("Product not found!");
        }
    }
}
