package afternoon.exception.uncheck;

import afternoon.exception.check.MyCheckException2;

import java.util.Random;

public class Client {
    public void callException() {
        throw new MyUnCheckException("Client.call에서 에러 발생");
    }

    public void callException2() throws MyCheckException {
        throw new MyCheckException("클라이언트.콜 에서 에러 발생");
    }
}


