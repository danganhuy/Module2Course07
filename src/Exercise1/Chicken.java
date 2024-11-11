package Exercise1;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeNoise() {
        return "Chicken: cluck-cluck";
    }

    @Override
    public String howToEat() {
        return "chicken could be boiled";
    }
}
