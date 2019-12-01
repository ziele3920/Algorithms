package listimpl;

public class ListUtilities {
    public static void display(IList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void insertSort(IList<Integer> listToSort) {
        int firstUnsortedIndex = 1;
        do {
            if (listToSort.get(firstUnsortedIndex) <= listToSort.get(0))
                moveValue(listToSort, firstUnsortedIndex, 0);
            else {
                for(int i = 0; i < firstUnsortedIndex-1; i++) {
                    if(listToSort.get(firstUnsortedIndex) >= listToSort.get(i) &&
                    listToSort.get(firstUnsortedIndex) <= listToSort.get(i+1)) {
                        moveValue(listToSort, firstUnsortedIndex, i+1);
                        break;
                    }
                }
            }
            firstUnsortedIndex++;
        } while(firstUnsortedIndex!=listToSort.size());

    }

    private static void moveValue(IList list, int fromIndex, int toIndex) {
        list.add(list.get(fromIndex), toIndex);
        list.remove(fromIndex+1);
    }
}
