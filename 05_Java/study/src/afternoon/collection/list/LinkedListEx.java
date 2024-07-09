package afternoon.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        //Linked
        list.addFirst(0);
        list.addLast(6);

        list.add(3, 22);

        System.out.println(list);

        int firstElement = list.getFirst();
        int lastElement = list.getLast();
        int midElement = list.get(4);
    }
}
