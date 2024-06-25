package afternoon.poly3.casting1;

public class Polymain1 {
    public static void main(String[] args) {
        Child child = new Child();

        child.childMethod();
        child.parentMethod();

        Parent parent = new Child();

        ((Child)parent).childMethod();



    }
}


