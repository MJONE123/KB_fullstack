package afternoon.extendss.access.child;

import afternoon.extendss.access.parent.Parent;

public class Child extends Parent {
    public void access() {
        //어디서든 접근가능
        System.out.println("public: " + publicValue);
        //패키지는 다르지만, 상속 관계라 가능
        System.out.println("protected: " + protectedValue);
        //패키지가 달라서 불가능
//        System.out.println("defaultValue" + defaultValue);
        //같은 클래스가 아니므로 불가능
//        System.out.println("privateValue" + privateValue);

        publicMethod();
        protectedMethod();
//        defaultMethod();
//        privateMethod();

        printParent();
    }
}
