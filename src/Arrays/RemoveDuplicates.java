package Arrays;

import java.util.Arrays;

class RemoveDuplicates{

    public int[] Remove(int nums[]){
        int n = nums.length;
        int ind = 0;
        for (int i = 1 ; i<n ; i++){
            if (nums[ind]!=nums[i]){
                ind++;
                nums[ind] = nums[i];
            }
        }
        return nums;
    }

    public static void main(String[] args){
        RemoveDuplicates r1 = new RemoveDuplicates();
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        int[] res = r1.Remove(arr);
        System.out.println(Arrays.toString(res));
    }
}