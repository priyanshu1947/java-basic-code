public class paramaterised
{
    static void func(int i,int sum)
    {
        if(i<1)
        {
            System.out.println(sum);
            return;
        }
        func(i-1,sum+i);
    }

    public static void main(String[] args) {
        int n=3;
        func(n,0);
    }
}
