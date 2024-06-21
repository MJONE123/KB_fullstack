package afternoon.extendss.superrr;

public class Album extends Item{
    private String artist;


    Album(int price, String name, String artist) {
        super(name, price);
        this.artist = artist;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("아티스트는?: " + artist);

    }
}
