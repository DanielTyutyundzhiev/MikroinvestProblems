package ducks;

public abstract class ToyDuck extends Duck {
    protected ToyDuck(int age, String color, String speciesName) {
        super(age, color, speciesName);
    }

    @Override
    String display() {
        return null;
    }
}
