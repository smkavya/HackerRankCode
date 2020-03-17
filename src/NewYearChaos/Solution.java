package NewYearChaos;

public class Solution {

    static void minimumBribes(int[] q) {
        int minBribes = 0;
        int n = q.length;
        String result = "";
        for(int j = 0; j < q.length; j++)
        {
            System.out.print(q[j]);
        }
        System.out.println();
        for(int i = 0; i < n; i++)
        {
            if(q[i] != (i+1))
            {
                if(q[i] == (i+2) || q[i] == (i+3))
                {
                    swap(q, i, i+1);
                    minBribes++;
                }
                else
                {
                    result = "Too Chaotic";
                }
            }
        }
        for(int j = 0; j < q.length; j++)
        {
            System.out.print(q[j]);
        }
        System.out.println();
        if(result != "")
        {
            System.out.println(result);
        }
        else
        {
            System.out.println(minBribes);
        }        
    }
    static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] q = {1, 2, 5, 3, 7, 8, 6, 4};
        minimumBribes(q);
    }

}
