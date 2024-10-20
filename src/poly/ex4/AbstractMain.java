package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {
        AbstractAnimal[] animals = {new Dog(), new Cat()};
        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
            moveAnimal(animal);
        }
    }

    private static void soundAnimal(AbstractAnimal animal){
        animal.sound();
    }
    private static void moveAnimal(AbstractAnimal animal){
        animal.move();
    }
}

