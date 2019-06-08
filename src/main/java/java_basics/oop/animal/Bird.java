package java_basics.oop.animal;

public class Bird extends Animal {
    public String reproduction = "egg";
    public String outerCovering = "feather";

    // static polymorphism using method overloading on flyUp()
    public void flyUp() {
        System.out.println("Bird is flying up");
    }
    public void flyUp(int height) {
        System.out.println("Bird is flying " + height + " feet high!");
    }
    public void flyUp(String name, int height) {
        System.out.println("The " + name + " is flying " + height + " feet hight!");
    }

    public void flyDown() {
        System.out.println("Flying down");
    }

    void move() {
        System.out.println("Moves by flying");
    }
    void eat() {
        System.out.println("eats birdfood");
    }
}
