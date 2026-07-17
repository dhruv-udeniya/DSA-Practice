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

    public int SecondMaxNum(int[] nums){
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int smax = -1;
        for (int i = 0 ; i<n ; i++){
            max = Math.max(max,nums[i]);
        }
        for (int i = 0 ; i<n ; i++){
            if (nums[i]<max){
                if (smax<nums[i]){
                    smax = nums[i];
                }
            }
        }
        return smax;
    }

    public static void main(String[] args){
        LargestElement l1 = new LargestElement();
        int nums[] = {1, 6, 2, 10, 3,9};
//        int res = l1.MaxNum(nums);
        int sres = l1.SecondMaxNum(nums);
        int res = l1.MaxNo(nums);
        System.out.println("Maximum Element in Array-:"+res);
        System.out.println("Second Largest Element-:"+sres);

    }
}