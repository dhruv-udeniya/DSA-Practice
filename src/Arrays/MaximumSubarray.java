package Arrays;

class MaximumSubarray{

    public int KadaneAlgorith(int nums[]){
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i<n ; i++){
            sum += nums[i];
            if (sum>max){
                max = sum;
            }
            if (sum<0){
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args){
        MaximumSubarray m1 = new MaximumSubarray();
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int res = m1.KadaneAlgorith(arr);
        System.out.println(res);
    }

}