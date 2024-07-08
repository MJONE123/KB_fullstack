package afternoon.generic.method;

public class GenericMethod {
    public static <T extends Number> T genericMethod(T t) {
        System.out.println("Generic method print : " + t);
        return t;
    }
}