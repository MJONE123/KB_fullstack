package afternoon.claass;

public class FishBreadMain {
    public static void main(String[] args) {
        FishBread fish1 = new FishBread("마라맛", "상어", 3000);
            fish1.printFishBread();
//        System.out.println("붕어빵의 맛은 : " + fish1.taste );
//        System.out.println("붕어빵의 모양은 : " + fish1.shape );
//        System.out.println("붕어빵의 가격은 : " + fish1.price );
//        System.out.println("붕어빵이 만들어진 시간은 :" + fish1.makeTime );

        FishBread fish2 = new FishBread();
        fish2.printFishBread();

//        System.out.println("붕어빵의 맛은 : " + fish2.taste );
//        System.out.println("붕어빵의 모양은 : " + fish2.shape );
//        System.out.println("붕어빵의 가격은 : " + fish2.price );
//        System.out.println("붕어빵이 만들어진 시간은 :" + fish2.makeTime );

    }
}

