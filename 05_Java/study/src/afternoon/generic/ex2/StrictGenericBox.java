package afternoon.generic.ex2;


import java.lang.reflect.Type;

public class StrictGenericBox<Type> {
    private Type value;

    public void setValue(Type value) {
        if (value instanceof String || value instanceof Integer || value instanceof Long) {
            this.value = value;
            System.out.println("전달 받은 값이 " + value.getClass().getSimpleName() +
                    "이 맞습니다." + " 값을 저장합니다.");
        } else {
            System.out.println("전달 받은 값이 String / Integer / Long이 아닙니다");
        }
    }

    public Type getValue() {
        return value;
    }
}
