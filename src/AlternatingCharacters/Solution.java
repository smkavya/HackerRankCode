package AlternatingCharacters;

public class Solution {

    static int alternatingCharacters(String s) {
        int dels = 0;
        int n = s.length();
        for(int i = 0; i < n - 1; i++)
        {
            if(s.charAt(i) == 'A' && s.charAt(i + 1) != 'B' ||
               s.charAt(i) == 'B' && s.charAt(i + 1) != 'A' )
            {
                dels++;
            }
        }
        return dels;
    }
    public static void main(String[] args) {
        
        String s = "AAABBB";
        System.out.println(alternatingCharacters(s));

    }

}
