class Solution {
    public String removeOuterParentheses(String s) 
    {
        String ans = "";
        int count = 0;
        for (int i =0;i < s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                if(count>0)
                {
                    ans= ans+'(';
                }
                count ++;
            }
            if(s.charAt(i)==')')
            {
                if(count>1)
                {
                    ans= ans+')';
                }
                count --;
            }
        }
        return ans;
     }
}