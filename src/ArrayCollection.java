import java.util.Arrays;
public class ArrayCollection
{
    public static void main(String[] args) {
        int [] numbers = {3,2,1,9,5,6,7,8,4};
       // int index = Arrays.binarySearch(numbers,4);
      //  System.out.println(index);

        Arrays.sort(numbers);
        System.out.println(numbers);

        int index = Arrays.binarySearch(numbers,4);
         System.out.println(index);

         // Arrays.fill(numbers,12);

         for(int i : numbers)
         {
             System.out.print(i+ " ");
         }
    }
}
