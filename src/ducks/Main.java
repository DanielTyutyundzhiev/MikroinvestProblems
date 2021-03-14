package ducks;

import ducks.type.MallardDuck;
import ducks.type.RubberDuck;

public class Main {
    public static void main(String[] args) {
      RubberDuck duck=new RubberDuck(12,"blue","azis");
        System.out.println(duck.makeSound());
        MallardDuck mallardDuck=new MallardDuck(69,"black","Pencho");

    }
}
