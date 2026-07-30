package Patterns;

class Pattern2{

    public void pattern(int n){
        for (int i = 0 ; i<n ; i++){
            System.out.print("*");
            for (int j = 0 ; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        Pattern2 p2 = new Pattern2();
        int n = 5;
        p2.pattern(n);
    }
}