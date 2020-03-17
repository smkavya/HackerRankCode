package SockMerchant;

public class Solution {

    private static int sockMerchant(int n, int[] ar) {
        int counter = 0;
        for(int i = 0; i < n -1; i++)
        {
            int pairA = ar[i];
            if(pairA != -1)
            {
                for(int j = i + 1; j < n - 1; j++)
                {
                 int pairB = ar[j];
                     if(pairA == pairB)
                     {
                         counter++;
                         ar[j] = -1;
                         j = n -1;
                     }
                 }
            }
        }
        return counter;
     }
        
    public static void main(String[] args) 
    {
        int n = 15;
        int ar[] = {6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5};
        System.out.print(sockMerchant(n, ar));

    }

}
