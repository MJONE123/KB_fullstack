package afternoon.nested.nested.ex1;

import java.util.Random;

public class Network {
    private boolean networkCondition;

    public boolean checkNetwork() {
        System.out.println("네트워크 상태를 점검합니다");
        Random rand = new Random();
        networkCondition = rand.nextBoolean();
        if (networkCondition) {
            System.out.println("네트워크 상태 정상");
            return true;
        } else {
            System.out.println("네트워크 상태 비정상");
            System.out.println("네트워크 종료");
            return false;
        }
    }

    public void sendMsg(String msg) {
        NetworkMsg networkMsg = new NetworkMsg(msg);
        networkMsg.send();
    }

    private static class NetworkMsg {
        private String msg;

        public NetworkMsg(String msg) {
            this.msg = msg;
        }

        public void send() {
            System.out.println("메시지 전송");
            System.out.println(this.msg);
            System.out.println("메시지 전송 종료");
        }
    }
}