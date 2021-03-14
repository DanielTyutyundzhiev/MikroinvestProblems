package ducks;

import ducks.actions.Eatable;
import ducks.actions.Flyable;
import ducks.actions.MakeSound;

public abstract class RealDuck extends Duck implements MakeSound, Flyable, Eatable {
    protected RealDuck(int age, String color, String speciesName) {
        super(age, color, speciesName);
    }

    @Override
    String display() {
        return "Im a real duck";
    }

    @Override
    public String eat() {
        return "Im eating";
    }

    @Override
    public String fly() {
        return "Im flying";
    }

    @Override
    public String makeSound() {
        return "Im quacking";
    }
}
