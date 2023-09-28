import java.util.ArrayList;
import java.io.*;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class collection
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(44);
        list.add(54);
        list.add(64);
        list.add(74);
        list.add(84);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list,84));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,Comparator.reverseOrder());
        System.out.println(list);
    }
}
