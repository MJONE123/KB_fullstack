package afternoon.exception.check;

import java.util.*;

public class Client {
    public final Random random = new Random();

    public void callException() throws MyCheckException {
        throw new MyCheckException("Client.call에서 에러 발생");
    }

    public void callRandException() throws MyCheckException2 {
        if (random.nextBoolean()) {
            throw new MyCheckException2("오늘은 운이 없으시군요");
        } else {
            System.out.println("오늘은 운이 좋으시군요");
        }
    }
}
