package afternoon.collection.list;

public class ArrEx {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // 배열 제일 뒤에 6을 추가해 주세요!
        int[] arr2 = new int [arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        arr2[arr.length] = 6;
        arr2 = arr;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
