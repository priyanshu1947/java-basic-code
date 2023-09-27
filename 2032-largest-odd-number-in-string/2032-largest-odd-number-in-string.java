

class Solution {
    public String largestOddNumber(String num) 
    {
        int n = num.length();
        int i =n-1;
        while(i>=0)
        {
            if (num.charAt(i) % 2 != 0)
            {
                return num.substring(0,i+1);
                
            }
            i--;
        }    
        return "";    
    }
}

/*
class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        int i = n - 1; // Start from the rightmost digit
        while (i >= 0) {
            if (num.charAt(i) % 2 != 0) {
                return num.substring(0, i + 1); // Return the substring up to and including the odd digit
            }
            i--;
        }
        return ""; // Return an empty string if no odd digits are found
    }
}
*/