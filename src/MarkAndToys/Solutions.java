package MarkAndToys;

public class Solutions {

    static int maximumToys(int[] prices, int k) {
        int n = prices.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (prices[j] > prices[j + 1]) {
                    int temp = prices[j];
                    prices[j] = prices[j + 1];
                    prices[j + 1] = temp;
                }
            }
        }
        
        int sum = 0;
        int index = 0;
        while(sum < k && index < n)
        {
            sum += prices[index];
            index++;
        }
        int numToys = index - 1;
        return numToys;
    }
    public static void main(String[] args) 
    {
        int[] prices = {1, 12, 5, 111, 200, 1000, 10};
        int k = 50;
        System.out.println(maximumToys(prices, k));
        
    }

}
