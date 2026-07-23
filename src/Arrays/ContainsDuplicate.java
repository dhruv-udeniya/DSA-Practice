package Arrays;

import java.util.Arrays;
import java.util.HashSet;

class ContainsDuplicate{

    public Boolean Duplicate(int nums[]){
        int n = nums.length;
        HashSet<Integer> st = new HashSet<>();
        for (int num : nums){
            if (st.contains(num)){
                return true;
            }
            st.add(num);
        }
//        if (st.size()<n){
//            return true;
//        }
        return false;
    }



    public static void main(String[] args){
        ContainsDuplicate c1 = new ContainsDuplicate();
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        Boolean res = c1.Duplicate(arr);
        System.out.println(res);
    }

}