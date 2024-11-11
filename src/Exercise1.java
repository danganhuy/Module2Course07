import Exercise1.*;

public class Exercise1 {
    // [Thực hành] triển khai interface 'Comparable' cho các lớp hình học (v.2023)
    public static void main(String[] args) {
        Tiger tiger  = new Tiger();
        Chicken chicken = new Chicken();
        Apple apple = new Apple();
        Orange orange = new Orange();

        Edible edible = chicken;

        System.out.println(tiger.makeNoise());
        System.out.println(chicken.makeNoise());
        System.out.println(chicken.howToEat());
        System.out.println(apple.howToEat());
        System.out.println(orange.howToEat());

        System.out.println(edible.howToEat());
    }
}
