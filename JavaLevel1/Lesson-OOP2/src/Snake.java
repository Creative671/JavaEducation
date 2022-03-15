public class Snake extends Animals{

    Snake(String name, String color) {
        super(name, color);
    }

    @Override
    void move() {
        System.out.println(name + " ползет");
    }

    @Override
    void voice() {
        System.out.println(name + " шипит");
    }
}
