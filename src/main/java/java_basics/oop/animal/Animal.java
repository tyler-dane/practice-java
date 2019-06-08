package java_basics.oop.animal;

abstract class Animal {

    abstract void move();
    abstract void eat();

    void label(){
        System.out.println("Animal's data: ");
    }
}
