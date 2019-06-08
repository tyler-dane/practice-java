package java_basics.oop.animal;

public class Eagle implements AnimalInterface, BirdInterface {
    public void eat() {
        System.out.println("Eagle eats reptiles, fish");
    }
    public void makeSound() {
        System.out.println("Eagle has high-pitched screetch");
    }
    public void fly() {
        System.out.println("Eagle uses long wings to fly");
    }
}
