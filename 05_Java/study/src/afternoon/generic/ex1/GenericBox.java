package afternoon.generic.ex1;

import java.lang.reflect.Type;

public class GenericBox<Type> {
    private Type value;

    public Type getValue() {
        return value;
    }

    public void setValue(Type value) {
        this.value = value;
    }
}

// Type 대신 보통 T를 쓴다