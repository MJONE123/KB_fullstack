package afternoon.interfacee.ex1;

public class Spanish implements Human{
    @Override
    public void speak() {
        System.out.println("I'm Spanish");
    };

    @Override
    public void eat() {
        System.out.println("스패니시는 paella를 먹습니다");
    };

    @Override
    public void hello() {
        System.out.println("hola 어쩌구저쩌구"+ year);
    };
}
