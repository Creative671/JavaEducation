public class Cat extends Animals {
    Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    void voice() {
        System.out.println(name + " мяукает");
    }
}
