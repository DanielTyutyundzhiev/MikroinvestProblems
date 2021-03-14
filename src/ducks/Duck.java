package ducks;

public abstract class Duck {
    private int age;
    private String color;
    private String name;

    protected Duck(int age, String color, String speciesName) {
        this.age = age;
        this.color = color;
        this.name = speciesName;
    }


    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    abstract String display();
}
