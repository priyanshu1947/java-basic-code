import java.util.*;
    public class deletionofarray2
    {
        public static void main(String []args)
        {
            int A[]=new int[10];
            A[0]=3;
            A[1]=9;
            A[2]=7;
            A[3]=8;
            A[4]=12;
            A[5]=6;

            Scanner sc = new Scanner(System.in);
            System.out.println("enter the index value");
            int index = sc.nextInt();

            for (int i=0;i<A.length;i++)
                System.out.print(A[i]+ ",");
            System.out.println("");

            for(int i=index;i<A.length-1;i++)
                A[i]=A[i+1];

            for (int i = 0; i < A.length; i++)

                System.out.print(A[i] + ",");
            System.out.println("");
        }
    }


