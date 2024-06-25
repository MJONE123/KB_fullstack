package afternoon.poly3.overriding.ex1;

// AnimalMain 클래스 정의
public class AnimalMain {
    // main 메소드 - 프로그램 시작 지점
    public static void main(String[] args) {
        // Animal 타입의 배열 생성 및 다양한 Animal 하위 클래스 객체로 초기화
        Animal[] animals = {new Animal(), new Dog(), new Cat(), new Duck()};
        // 배열에 있는 각 동물 객체에 대해 animalCall 메소드 호출
        for (Animal a : animals) {
            animalCall(a);
        }
    }

    // animalCall 메소드 - Animal 객체를 인자로 받아 동작을 수행
    public static void animalCall(Animal animal) {
        // Animal 객체의 sound 메소드 호출
        // 이 메소드는 각 하위 클래스에서 오버라이딩되어 해당 클래스의 sound 메소드가 호출됨
        animal.sound();
        // 객체가 Duck 타입인지 확인
        if (animal instanceof Duck) {
            // 다운캐스팅을 통해 Animal 타입을 Duck 타입으로 변환
            // Duck 클래스의 fly 메소드 호출
            ((Duck)animal).fly();
        }
    }
}
