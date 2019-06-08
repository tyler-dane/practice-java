package java_basics.oop.animal;

public class TestAnimal {
    public static void main(String[] args) {
        Animal b = new Bird();
        Animal f = new Fish();

        b.move();
        b.eat();
        f.move();
        f.eat();
    }
}
