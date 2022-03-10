public class Dog extends Animals{
    String color;

    Dog(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void dogInfo(){
        System.out.println("Животное: " + name + " цвет: " + color);
    }
}
