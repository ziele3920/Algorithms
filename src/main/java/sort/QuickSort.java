package sort;

public class QuickSort {
    public void sort(int[] t, int fi, int li) {
        if(li < 1 || li == fi) return;
        int swapIndex = fi;
        int pivot = t[li];
        for(int i = fi; i <= li; i++) {
            if (t[i] <= pivot) {
                swap(t, i, swapIndex);
                swapIndex++;
            }
        }
        sort(t, fi, swapIndex-2);
        sort(t, swapIndex, li);
    }

    private void swap(int[] t, int index1, int index2) {
        int tmp = t[index1];
        t[index1] = t[index2];
        t[index2] = tmp;
    }
}
