package afternoon.nested.nested.inner;

public class Outer {
    private static String outerStatic = "outerStatic";
    private String outerInstance = "outerInstance";

    class Inner {
        private static String nestedStatic = "innerStatic";
        private String nestedInstance = "innerInstance";

        public void print() {
            System.out.println("innerStatic = " + nestedStatic);
            System.out.println("outerstatic = " + outerStatic);

            //클래스 내부의 non-static 값에 접근
            System.out.println("innerInstance = " + nestedInstance);
            System.out.println("outerInstance = " + outerStatic);

            //클래스 내부의 non-static (인스턴스) 에 접근
            System.out.println("nestedInstance = " + nestedInstance);
            System.out.println("outerStatic = " + outerInstance);


        }
    }
}
