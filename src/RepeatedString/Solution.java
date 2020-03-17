package RepeatedString;

public class Solution {

    static long repeatedString(String s, long n) {
        long numReps = n/s.length();
        long remChars = n % s.length();
        long aCount = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'a')
            {
                aCount += 1;
            }
        }
        
        aCount *= numReps;
        
        for(int j = 0; j < remChars; j++)
        {
            if(s.charAt(j) == 'a')
            {
                aCount += 1;
            }
        }
        return aCount;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        long n = 10;
        String s = "aba";
        System.out.print(repeatedString(s, n));

    }

}
