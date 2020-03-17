package JumpingOnClouds;

public class Solution {
 
    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        
        int numJumps = 0;
        int i = 0;
        while(i < c.length - 2)
        {
            if(c[i + 2] != 1)
            {
                numJumps++;
                i += 2;
            }
            else
            {
                numJumps++;
                i++;
            }
        }
        if(i == c.length - 2 && c[i + 1] != 1)
        {
            numJumps++;
        }
        return numJumps;
    }
    public static void main(String[] args) {
        
        int c[] = {0, 0, 0, 1, 0, 0};
        
        System.out.println(jumpingOnClouds(c));
    }

}
