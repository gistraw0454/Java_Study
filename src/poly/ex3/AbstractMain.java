package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        AbstractAnimal[] animals = {new Dog(), new Cat()};
        for (AbstractAnimal animal : animals) {
            animal.sound();
        }
    }
}

