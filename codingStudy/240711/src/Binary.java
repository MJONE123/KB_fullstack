import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {
        int[] n = {38102, 4, 7, 2, 0, 18, 2098, 582};
        Arrays.sort(n);
    }



    int binarySearch(int[] n, int target, int l, int r) {
        if (r < 1) return -1;
        int mid = (1 + r) / 2;
        if (n[mid] == target)
            return mid;

        else if (target < n[mid]) return binarySearch(n, target, l, mid - 1);
        else return binarySearch(n, target, mid + 1, r);
    }
}
