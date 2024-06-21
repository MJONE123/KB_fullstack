package afternoon.extendss.superrr;

public class Item {
    private String name;
    private int price;

    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print() {
        System.out.println("이름은? " + this.name);
        System.out.println("가격은? " + this.price);
    }
}
