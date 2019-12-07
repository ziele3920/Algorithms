package streams;

import java.util.Arrays;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 16 , 5, 11, 3);
        int sum = list.stream().filter(value -> value < 10).mapToInt(v -> v).sum();
        System.out.println(sum);
        int sum2 = list.stream().mapToInt(v -> 2*v).filter(v -> v < 10).sum();
        System.out.println(sum2);
        int[] tab = list.stream().filter(v -> v < 15).sorted((v1, v2) -> v2-v1).mapToInt(v -> v).toArray();
        System.out.println(Arrays.toString(tab));
    }
}
