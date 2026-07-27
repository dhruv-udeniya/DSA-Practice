package Arrays;

class MissingNo{

    public int missingNumber(int nums[]){
        int n = nums.length;
        int sum = 0;
        int nsum = n*(n+1)/2;
        for(int i = 0 ; i<n ; i++){
            sum += nums[i];
        }
        return nsum-sum;
    }


    public static void main(String[] args){
        MissingNo m1 = new MissingNo();
        int arr[] = {3,0,1};
        int res = m1.missingNumber(arr);
        System.out.println(res);
    }
}