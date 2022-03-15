public class Dog extends Animals {

    String child;

    Dog(String name, String color, int age) {
        super(name, color, age);
    }

    Dog(String name, String color, int age, String child) {
        super(name, color, age);
        this.child = child;
    }

    Dog(String name) {
        super(name);
    }

    @Override
    void voice() {
        System.out.println(name + " гавкает");
    }
}
