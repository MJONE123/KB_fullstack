package afternoon.generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerGenericBox = new GenericBox<Integer>();
        integerGenericBox.setValue(10);
        Integer integer = integerGenericBox.getValue();
        System.out.println("integer = " + integer);

        GenericBox<Integer> stringGenericBox = new GenericBox<Integer>();
        stringGenericBox.setValue(Integer.valueOf("hello"));
        String string = String.valueOf(stringGenericBox.getValue());
        System.out.println("integer = " + integer);
    }


}
