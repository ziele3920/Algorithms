package sort;

import java.util.Arrays;

public class SortMain {
    public static void main(String[] args) {
        int[] table = new int[] {4,2,6,9,3,10,5};
        QuickSort qs = new QuickSort();
        System.out.println(Arrays.toString(table));
        qs.sort(table, 0, table.length-1);
        System.out.println(Arrays.toString(table));
    }
}
