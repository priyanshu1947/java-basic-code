import java.util.*;
public class arraylist
{
    public static void main(String[] args)
    {


        // ArrayList<String> list1 = new ArrayList<String>();
        // ArrayList<Boolean> list3 = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        // add element
        list.add(0);
        list.add(1);
        list.add(5);
        System.out.println(list);

        // get a element

        int element = list.get(0);
        System.out.println(element);

        // add element in between

        list.add(1,6);
        System.out.println(list);
       // change any element

        list.set(0,5);
        System.out.println(list);
// delete element

        list.remove(1);
        System.out.println(list);

        // size of element
       int size= list.size();
        System.out.println(size);

        // iterate in loop

        for (int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i));
        }
        System.out.println();

        // sorting
        Collections.sort(list);
        System.out.println(list);

    }

}
