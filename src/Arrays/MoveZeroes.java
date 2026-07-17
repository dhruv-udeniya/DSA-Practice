package Arrays;

import java.util.Arrays;

class MoveZeroes{

    public int[] Move(int[] nums){
        int n = nums.length;
        int ind = 0;
        for(int i = 0 ; i<n ; i++){
            if(nums[i] != 0){
                nums[ind] = nums[i];
                ind++;
            }
        }
        while (ind<n){
            nums[ind] = 0;
            ind++;
        }
        return nums;
    }

    public static void main(String[] args){
        MoveZeroes m1 = new MoveZeroes();
        int arr[] = {0,1,0,3,12};
        int res[] = m1.Move(arr);
        System.out.println(Arrays.toString(res));

    }

}