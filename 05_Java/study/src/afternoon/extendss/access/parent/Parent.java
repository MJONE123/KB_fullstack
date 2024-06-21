package afternoon.extendss.access.parent;

public class Parent {
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("parent.publicMethod");

    }

    protected void protectedMethod() {
        System.out.println("parent.protectedMethod");
    }

    void defaultMethod() {
        System.out.println("parent.defaultMethod");

    }

    private void privateMethod() {
        System.out.println("parent.privateMethod");
    }

    public void printParent() {
        System.out.println("publicValue: " + publicValue);
        System.out.println("protectedValue: " + protectedValue);
        System.out.println("defaultValue: " + defaultValue);
        System.out.println("privateValue: " + privateValue);


        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();

    }

}


