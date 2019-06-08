package java_basics.oop.animal;

public class TestBird {
    public static void main(String[] args){
        Bird b = new Bird();

        b.flyUp();
        b.flyUp(999);
        b.flyUp("falcon", 777);
    }
}
