package task1;

public class Main {
    public static void main(String[] args) {




        Vending vending = new FruitVending();

        Product product1 = new Apple("Apple", 20, 1L);
        Product product2 = new Orange("Orange", 30, 2L);
        Product product3 = new Banana("Banana", 25, 3L);

        vending.addProduct(product1);
        vending.addProduct(product2);
        vending.addProduct(product3);

        System.out.println(vending.getProduct("Apple"));
        System.out.println(vending.getProduct("Orange"));
        System.out.println(vending.getProduct("Banana"));

        System.out.println(vending.getProduct(1L));
        System.out.println(vending.getProduct(2L));
        System.out.println(vending.getProduct(5L));

    }
}
