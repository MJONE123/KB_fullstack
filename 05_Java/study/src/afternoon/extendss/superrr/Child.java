package afternoon.extendss.superrr;

public class Child extends Parent {
    public Child(String name) {

        super(); // 부모의 기본 생성자 - 생략 가능. Parent(); 와 동일하다. '생성자'니까
        System.out.println("Child 생성자");
    }

    public  Child(String name, int age) {
        super(); // 생략된 부모의 기본 생성자
        System.out.println("Child 생성자2");
    }

}
