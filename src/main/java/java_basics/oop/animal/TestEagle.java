package java_basics.oop.animal;

public class TestEagle {
    public static void main(String[] args) {
        Eagle e = new Eagle();
        e.eat();
        e.fly();
        e.makeSound();

        // access static fields from Eagle's interface (BirdInterface)
        System.out.println("Number of eagle legs: " + BirdInterface.numberLegs);
        System.out.println("Eagle outer covering: " + BirdInterface.outerCovering);
    }
}
