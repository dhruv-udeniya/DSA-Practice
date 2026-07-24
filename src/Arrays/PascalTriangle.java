package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Pascal{

    public List<List<Integer>> triangle(int n){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        for(int i = 0 ; i<n ; i++){

            List<Integer> rows = new ArrayList<>();

            rows.add(1);

            for (int j = 1 ; j<i ; j++){
                rows.add(prev.get(j-1)+ prev.get(j));
            }

            if (i>0){
                rows.add(1);
            }
            ans.add(rows);
            prev = rows;
        }
        return ans;
    }


    public static void main(String args[]){
        Pascal p1 = new Pascal();
        int n = 6;
        List<List<Integer>> ans = p1.triangle(n);
        System.out.println(Arrays.deepToString(new List[]{ans}));
    }

}