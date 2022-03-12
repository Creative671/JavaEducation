package ZOO;

import ZOO.Animals;

public class Dog extends Animals {

    String child;

    Dog(String name, String color, int age, String child){
        super(name, color, age);
        this.child = child;
    }
}
