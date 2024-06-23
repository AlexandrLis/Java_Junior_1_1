import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(ThreadLocalRandom.current().nextInt(100));
        }

        System.out.println(list);

        System.out.println(resultat(list));
    }
    public static long resultat(List<Integer> list){
        long summa = list.stream().filter(a -> a%2 == 0).reduce(0, (a, b) -> a + b);
        long cnt = list.stream().filter(a -> a%2 == 0).count();
        return summa/cnt;
    }
}
