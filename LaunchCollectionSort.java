import java.util.ArrayList;
import java.util.Collections;

public class LaunchCollectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(18);
        li.add(8);
        li.add(20);
        li.add(15);

        System.out.println(li);
        Collections.sort(li);
        System.out.print(li);
    }
}
