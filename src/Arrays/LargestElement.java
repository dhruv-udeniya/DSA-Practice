package Arrays;

class LargestElement{

    public int MaxNum(int[] nums){
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<n ; i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }
        return max;
    }

    public int MaxNo(int[] nums){
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i<n ; i++){
            max = Math.max(max,nums[i]);
        }
        return max;
    }

    public static void main(String[] args){
        LargestElement l1 = new LargestElement();
        int nums[] = {1, 6, 2, 10, 3};
//        int res = l1.MaxNum(nums);
        int res = l1.MaxNo(nums);
        System.out.println(res);

    }
}