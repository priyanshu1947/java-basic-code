import java.util.LinkedList;
import java.util.Queue;

public class linkedlistandqueue
{
    public static void main(String[] args)

    {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(20);
        queue.offer(78);

        System.out.println(queue);

        int store = queue.poll();
        System.out.println(store);

        System.out.println(queue);

        int store1 = queue.peek();
        System.out.println(store1);




    }

}

