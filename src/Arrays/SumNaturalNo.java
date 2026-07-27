package Arrays;

class SumNaturalNo{

    public int Sum(int n){
        int sum = 0;
        for (int i = 0 ; i<=n ; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args){
        SumNaturalNo s1 = new SumNaturalNo();
        int n = 9;
        int res = s1.Sum(n);
        System.out.println(res);
    }
}