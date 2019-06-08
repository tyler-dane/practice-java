package java_basics.oop.animal;

public class TestShark {
    public static void main(String[] args){
        AnimalConcrete ac = new AnimalConcrete();
        Shark s = new Shark();
        ac.eat();
        s.eat();
    }
}
