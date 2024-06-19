package afternoon.claass;



public class Customer {
    String name;
    int age;
    int total;
    boolean blacklist;

    Customer() {
        this.name = "아직 몰라요";
        this.age = 0;
        this.total = 0;
        this.blacklist = false;
    }

    Customer(String name, int age, int total, boolean blacklist) {
        this.name = name;
        this.age = age;
        this.total = total;
        this.blacklist = blacklist;

    }

    void printCustomer() {
        System.out.println("고객의 이름은? : " + this.name);
        System.out.println("고객의 나이는? : " + this.age);
        System.out.println("고객이 총 사용한 금액은? " + this.total);
        System.out.println("고객의 블랙리스트 여부는? : " + this.blacklist);
    }
}
