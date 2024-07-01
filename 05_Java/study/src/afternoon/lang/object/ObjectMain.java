package afternoon.lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();

        child.childMethod();
        child.parentMethod();

        System.out.println(child.toString());
        System.out.println(child);

        String ref1 = Integer.toHexString(child.hashCode());
        int ref2 = child.hashCode();
        String ref3 = Integer.toHexString(System.identityHashCode(child));

        System.out.println("ref1 = " + ref1);
        System.out.println("ref2 = " + ref2);
        System.out.println("ref3 = " + ref3);

        Parent[] obj = {new Parent(), new Child()};
        Object[] obj2 = {new Parent(), new Child(), new OtherClass()};

//        public static int size (Object[] objs) {
//            return objs.length;
        }
    }



