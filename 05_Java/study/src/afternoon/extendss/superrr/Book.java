package afternoon.extendss.superrr;

public class Book extends Item{
    private String title;
    private String author;

    Book(String title, String author, int price, String name) {
        super(name, price);
        this.title = title;
        this.author = author;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("타이틀은? : " + title);
        System.out.println("저자는?: " + author);

    }
}
