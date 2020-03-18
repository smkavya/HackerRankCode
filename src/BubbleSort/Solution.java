package BubbleSort;

public class Solution {

    // Complete the countSwaps function below.
    /**
     * Array is sorted in 3 swaps.  
     * First Element: 1  
     * Last Element: 6
     */
    static void countSwaps(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    count++;
                }
            }
        }
      
        System.out.println("Array is sorted in " + count + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }
    public static void main(String[] args) 
    {
        int[] a = {3, 2, 1};
        countSwaps(a);
    }

}
