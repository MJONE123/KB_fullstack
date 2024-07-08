package afternoon.generic.ex3;

import org.w3c.dom.ls.LSOutput;

public class PairMain {
    public static void main(String[] args) {
        Pair<String, String> nameDate = new Pair<>("문준일","name");
        Pair<Integer, String> ageDate = new Pair<>(3,"age");
        Pair<Boolean, String> marriedDate = new Pair<>(true,"married");

        System.out.println(nameDate);
        System.out.println(ageDate);
        System.out.println(marriedDate);
    }


}
