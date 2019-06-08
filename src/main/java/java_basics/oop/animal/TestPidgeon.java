package java_basics.oop.animal;

public class TestPidgeon {
    public static void main(String[] args) {
        Pidgeon p = new Pidgeon();
        System.out.println("Pidgeon name: " + p.name); // field added by Pidgeon subclass
        System.out.println("Pidgeon lifespan: " + p.lifeSpan); // from Pidgeon subclass
        System.out.println("Pidgeon outer covering: " + p.outerCovering); // from parent Bird class

        p.flyUp();
        p.flyDown();
    }
}
