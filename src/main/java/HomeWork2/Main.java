package HomeWork2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("John", 33, "Russia");
        Human human2 = new Human("Tom", 30, "USA");
        Human human3 = new Human("Fred", 22, "Boston");



        System.out.println(human1);
        human1.setMakeOrder();
        System.out.println(human1);
        human1.setTakeOrder();
        System.out.println(human1);
    }
}
