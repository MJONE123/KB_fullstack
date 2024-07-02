package afternoon.nested.nested.inner.ex3;

public class OuterClass2Main {
    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.InnerClass innerclass = outerClass2.new InnerClass();
        innerclass.hello();
    }


}
