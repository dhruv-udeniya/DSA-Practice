package Arrays;

import java.util.Arrays;
import java.util.HashMap;

class TwoSum{

    public int[] bruteForce(int[] nums , int target){
        int n = nums.length;
        for (int i = 0 ; i<n ; i++){
            for (int j = i+1 ; j<n ; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    public int[] Better(int[] nums , int target){
        int n = nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i = 0 ; i<n ; i++){
            int complement = target - nums[i];
            if (mp.containsKey(complement)){
                return new int[]{mp.get(complement),i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[]args){
        TwoSum t1 = new TwoSum();
        int arr[] = {1, 6, 2, 10, 3};
        int target = 7;
//        int res[] = t1.bruteForce(arr, target);
        int res[] = t1.Better(arr,target);
        System.out.println(Arrays.toString(res));

    }
}