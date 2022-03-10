public class Animals {
    String name;

    Animals(){

    }

    Animals(String name){
        this.name = name;
    }

    public void animalInfo(){
        System.out.println("Животное: " + name);
    }

    public void animalJump(){
        System.out.println(name + " прыгает");
    }
}
