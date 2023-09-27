import java.util.HashSet;
import java.util.Set;
public class LearnSet
{
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(23);
        set.add(2);
        set.add(29);
        set.add(21);
        set.add(65);

        set.remove(65);

        boolean check = set.contains(65);
        System.out.println(set.isEmpty());

        System.out.println(set.size());
        set.clear();
        System.out.println(check);


    }
}
