package ZOO;

public class Animals {
    protected String name;
    protected String color;
    protected int age;

    Animals(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    Animals(String name, String color){
        this(name, color, 0);
    }
}
