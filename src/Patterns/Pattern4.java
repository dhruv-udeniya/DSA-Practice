package Patterns;

class Pattern4{

    public void pattern(int n){
        for (int i = n ; i>0 ; i--){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Pattern4 p1 = new Pattern4();
        int n = 5;
        p1.pattern(n);
    }
}