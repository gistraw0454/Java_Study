package poly.ex5;


public class InterfaceMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        InterfaceAnimal[] animals = {new Dog(), new Cat()};
        for (InterfaceAnimal animal : animals) {
            soundAnimal(animal);
            moveAnimal(animal);
        }
    }
    private static void soundAnimal(InterfaceAnimal animal){
        animal.sound();
    }
    private static void moveAnimal(InterfaceAnimal animal){
        animal.move();
    }
}
