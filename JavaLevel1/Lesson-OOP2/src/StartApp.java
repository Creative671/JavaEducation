public class StartApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Барсик", "Серый", 1);
        Cat cat = new Cat("Дуся", "Белый", 3);
        Bird bird = new Bird("Чижик", "Красный", 1, 12);
        Parrot parrot = new Parrot("Кеша", "Жёлтый", 15, 5);

        dog.voice();
        cat.voice();
        bird.voice();
    }
}
