package Patterns;

class Pattern3{

    public void pattern(int n){
        for (int i = 1 ; i<=n ; i++){
            for (int j = 1 ; j<i ; j++){
                System.out.print(j);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        Pattern3 p1 = new Pattern3();
        int n = 5;
        p1.pattern(n);
    }
}