package java_basics.oop.animal;

public class TestAnimalConcrete {
    public static void main(String[] args) {
        AnimalConcrete a = new AnimalConcrete();

        // use setters
        a.setName("Turtle");
        a.setAverageWeight(3.2);
        a.setNumberOfLegs(4);

        // use getters
        System.out.println("Animal name: " + a.getName());
        System.out.println("Weight: " + a.getAverageWeight());
        System.out.println("Number legs: " + a.getNumberOfLegs());
    }
}
