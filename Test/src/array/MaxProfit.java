package array;

public class MaxProfit {
	 public static int findMaxProfit(int[] price)
	    {
	        // keep track of the maximum profit gained
	        int profit = 0;
	 
	        // initialize the local minimum to the first element's index
	        int j = 0;
	 
	        // start from the second element
	        for (int i = 1; i < price.length; i++)
	        {
	            // update the local minimum if a decreasing sequence is found
	            if (price[i - 1] > price[i]) {
	                j = i;
	            }
	 
	            // sell shares if the current element is the peak,
	            // i.e., (`previous <= current > next`)
	            if (price[i - 1] <= price[i] &&
	                (i + 1 == price.length || price[i] > price[i + 1]))
	            {
	                profit += (price[i] - price[j]);
	                System.out.printf("Buy on day %d and sell on day %d\n", j , i );
	            }
	        }
	 
	        return profit;
	    }
	 
	    public static void main(String[] args)
	    {
	        int[] price = { 100, 180, 260, 310, 40, 535, 695};
	 
	        System.out.print("\nTotal profit earned is " + findMaxProfit(price));
	    }
}
