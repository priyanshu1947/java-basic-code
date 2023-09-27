import java.util.ArrayDeque;
public class Arraydeque
{
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(45);
        adq.offerFirst(12);
        System.out.println(adq);

        adq.offerLast(35);
        adq.offer(78);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println(adq);

        System.out.println(adq.pollFirst());
        System.out.println(adq);

        System.out.println(adq.pollLast());
        System.out.println(adq);

    }


}
