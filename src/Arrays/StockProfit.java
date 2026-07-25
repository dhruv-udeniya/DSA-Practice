package Arrays;

class StockProfit{

    public int maxprofit(int nums[]){
        int n = nums.length;
        int profit = 0;
        int mini = nums[0];
        for (int i = 0 ; i<n ; i++){
            int cost = nums[i]-mini;
            profit = Math.max(cost,profit);
            mini = Math.min(mini,nums[i]);
        }
        return profit;
    }


    public static void main(String[] args){
        StockProfit s1 = new StockProfit();
        int arr[] = {7,1,5,3,6,4};
        int res = s1.maxprofit(arr);
        System.out.println(res);
    }
}