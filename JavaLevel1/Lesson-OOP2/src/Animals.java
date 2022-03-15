public abstract class Animals {
    protected String name;
    protected String color;
    protected int age;

    Animals(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    Animals(String name, String color) {
        this(name, color, 0);
    }

    Animals(String name) {
        this(name, null, 0);
    }

    abstract void voice();

    void move() {
        System.out.println(name + " идёт на лапках");
    }
}
