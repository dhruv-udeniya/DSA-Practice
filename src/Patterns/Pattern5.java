package Patterns;

class Pattern5{

    public void pattern(int n){
        for (int i = 1 ; i<=n ; i++){
            for (int j = 1 ; j<i+1 ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Pattern5 p1 = new Pattern5();
        int n = 5;
        p1.pattern(n);
    }
}