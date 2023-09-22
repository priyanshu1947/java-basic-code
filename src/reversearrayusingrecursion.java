public class reversearrayusingrecursion
{
    static void func(int l, int r,int [] arr)
    {
        if (l>=r)
        {
            return;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        func(l+1,r-1,arr);
    }

    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6};
        func(0,arr.length-1,arr);

        for (int i =0;i<arr.length;i++) {


            System.out.print(arr[i]+ " ");
        }
    }
}
