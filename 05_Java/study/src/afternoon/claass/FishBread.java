package afternoon.claass;

import java.util.Date;

public class FishBread {
    String taste = "팟";
    String shape = "붕어";
    int price = 500;
    Date makeTime = new Date();

    FishBread(){}

    FishBread(String taste, String shape, int price) {
        this.taste = taste;
        this.shape = shape;
        this.price = price;

    }

    void printFishBread() {
        System.out.println( "붕어빵 무슨맛이야??: " +this.taste);
        System.out.println( "무슨모양인데??: " +this.shape);
        System.out.println( "뿡어빵 가격은??: " +this.price);
        System.out.println( "얼마나 오랙 걸림??: " +this.makeTime);
    }
}
