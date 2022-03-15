public class Bird extends Animals {

    private int flyHeight;

    Bird(String name, String color, int age, int flyHeight) {
        super(name, color, age);
        this.flyHeight = flyHeight;
    }

    Bird(String name, String color) {
        super(name, color);
    }

    public int getFlyHeight() {
        return flyHeight;
    }

    public void setFlyHeight(int flyHeight) {
        this.flyHeight = flyHeight;
    }

    @Override
    void voice() {
        System.out.println(name + " чирикает");
    }
}
