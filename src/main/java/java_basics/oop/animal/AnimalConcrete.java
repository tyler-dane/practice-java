package java_basics.oop.animal;

public class AnimalConcrete {
    //private fields, requires getters/setters to access
    private String name;
    private double averageWeight;
    private int numberOfLegs;

    //parent class's method; is overridden by child Shark's eat()
    public void eat() {
        System.out.println("This animal eats insects [AnimalConcrete]");
    }

    // getters for private fields
    public String getName() {
        return name;
    }
    public double getAverageWeight() {
        return averageWeight;
    }
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    // setters for private fields
    public void setName(String name) {
        this.name = name;
    }
    public void setAverageWeight(double averageWeight) {
        this.averageWeight = averageWeight;
    }
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}
