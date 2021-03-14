package ducks.type;

import ducks.ToyDuck;
import ducks.actions.MakeSound;

public class RubberDuck  extends ToyDuck implements MakeSound {
    public RubberDuck(int age, String color, String speciesName) {
        super(age, color, speciesName);
    }

    @Override
    public String makeSound() {
        return "SKrrrr";
    }
}
