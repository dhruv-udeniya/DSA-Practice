package Patterns;

class Pattern1{

    public void pattern(int n){
        for (int i = 0 ; i<n ; i++){
            for (int j = 0 ; j<n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Pattern1 p1 = new Pattern1();
        int n = 5;
        p1.pattern(n);
    }
}