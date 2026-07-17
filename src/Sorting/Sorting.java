//import java.util.Arrays;
//
//class Solution{
//
//    public int[] SelectionSort(int nums[]){
//        int n = nums.length;
//        for(int i = 0 ; i<n ; i++){
//            int mini = i;
//            for(int j = i+1 ; j<n ; j++){
//                if (nums[j]<nums[mini]){
//                    mini = j;
//                }
//            }
//            int temp = nums[mini];
//            nums[mini] = nums[i];
//            nums[i] = temp;
//        }
//        return nums;
//    }
//
//
//    public int[] Bublesort(int[] nums){
//        int n = nums.length;
//
//        for(int i = n-1 ; i>=0 ; i--){
//            for (int j = 0 ; j<i ; j++){
//                if(nums[j]>nums[j+1]){
//                    int temp = nums[j];
//                    nums[j] = nums[j+1];
//                    nums[j+1] = temp;
//                }
//            }
//        }
//        return nums;
//    }
//
//    public int[] Insertion(int nums[]){
//        int n = nums.length;
//
//        for(int i = 0 ; i<n ; i++){
//            int j = i;
//
//            while(j>0 && nums[j-1]>nums[j]){
//                int temp = nums[j-1];
//                nums[j-1] = nums[j];
//                nums[j] = temp;
//                j--;
//            }
//        }
//        return nums;
//    }
//
//    public static void main(String[] args){
//        Solution sc=new Solution();
//
//        int arr[] = {34,5,6,3,54,88,3};
//        int res[] = sc.SelectionSort(arr);
//
//        System.out.println(Arrays.toString(res));
//
//    }
//}
//
