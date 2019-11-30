package listimpl;

import java.util.Random;

public class ListMain {
    public static void main(String[] args) {
        // IList<Integer> list = new ArrayList1<>(); // w zależności obiekt, której klasy chcemy implementować
        IList<Integer> list = new LinkedList<>();
        Random rand=new Random();
        int numbersCount=10;
        for (int i = 0; i < numbersCount; i++) {
            list.add(rand.nextInt(20));
        }
        ListUtilities.display(list);
        list.set(19, 3);
        ListUtilities.display(list);
    }
}
