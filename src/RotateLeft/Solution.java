package RotateLeft;

public class Solution {

    static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        int[] result = new int[n];
        for(int i = 0; i < n; i++)
        {
            result[i] = a[((d+i) % n)];
        }
        
        for(int j = 0; j < result.length; j++)
        {
            System.out.print(result[j] + " ");;
        }
        return result;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a = {1, 2, 3, 4, 5, 6};
        int d = 7;
        
        rotLeft(a, d);
    }

}
