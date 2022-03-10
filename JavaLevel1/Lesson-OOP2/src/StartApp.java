public class StartApp {
    public static void main(String[] args){
        Animals animals = new Animals("Кошка");
        Dog dog = new Dog("Собака", "серый");

        animals.animalInfo();
        dog.animalInfo();
        dog.animalJump();
        dog.dogInfo();
    }
}
