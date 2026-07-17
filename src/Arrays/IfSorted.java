package Arrays;

class IfSorted{

    public boolean CheckSorted(int nums[]){
        int n = nums.length;
        for (int i = 1 ;i<n ; i++){
            if (nums[i-1]<=nums[i]){

            }
            else {
                return false;
            }
        }
        return true;
    }

    public boolean check(int[] nums) {  //Check If Array is Rotated Sorted
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        return count <= 1;
    }


    public static void main(String[] arsg){
        IfSorted sc = new IfSorted();
        int arr[] = {10,20,30,4,5};
        boolean res = sc.check(arr);
        System.out.println(res);
    }
}