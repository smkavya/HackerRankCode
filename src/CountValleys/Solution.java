package CountValleys;

public class Solution {

    static int countingValleys(int n, String s) {
        int altitude[] = new int[s.length()];
        int currDepth = 0;
        for(int i = 0; i < s.length() - 1; i++)
        {
            if(s.charAt(i) == 'U')
            {
                currDepth += 1;
            }
            else if(s.charAt(i) == 'D')
            {
                currDepth -= 1;
            }
            altitude[i] = currDepth;
        }
        
        /****************************************/
        
        System.out.print("[");
        for(int k = 0; k < altitude.length - 1; k++)
        {
            System.out.print(altitude[k] + ",");
        }
        System.out.print(altitude[altitude.length -1]);
        System.out.println("]");
                
        /****************************************/
        
        int count = 0;
        for(int j = 1; j <= altitude.length - 1; j++)
        {
            if(altitude[j] == 0 && altitude[j - 1] < 0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
        int n = 8;
        String s = "UDDDUDUU";
        System.out.println(countingValleys(n, s));

    }

}
