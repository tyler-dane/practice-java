package java_basics.oop.animal;

public class Shark extends AnimalConcrete {

    //overrides parent class's eat() using dynamic polymorphism
    public void eat(){
        System.out.println("This Shark eats lobster [Shark]");
    }
}
