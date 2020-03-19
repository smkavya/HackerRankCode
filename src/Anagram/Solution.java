package Anagram;

public class Solution {

    static int makeAnagram(String a, String b) {
        int dels = 0;
        int charsa[] = new int[256];
        int charsb[] = new int[256];
        
        for(int i = 0; i < a.length(); i++)
        {
            charsa[(int)a.charAt(i)]++;
        }
        
        for(int j = 0; j < b.length(); j++)
        {
            charsb[(int)b.charAt(j)]++;
        }
        
        for(int k = 0; k < charsa.length; k++)
        {
            if(charsa[k] > charsb[k])
            {
                dels += charsa[k] - charsb[k];
            }
            else
            {
                dels += charsb[k] - charsa[k];
            }
        }
        
        return dels;
    }
    public static void main(String[] args) {
        String a = "cde";
        String b = "abd";
        System.out.println(makeAnagram(a, b));

    }

}
