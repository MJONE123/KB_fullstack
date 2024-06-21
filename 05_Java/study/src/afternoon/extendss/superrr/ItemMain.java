package afternoon.extendss.superrr;

public class ItemMain {
    public static void main(String[] args) {
        Book book = new Book("책", "채쌤", 10000, "아무책");
        Album album = new Album(10000, "아무엘범", "홍길동");
        book.print();
        album.print();

        System.out.println();

    }
}
