public class factorial {
    public static int facto(int n){
        int fact=1;
        if(n==0) return 1;
        fact=n*facto(n-1);
        return fact;
    }
    public static void main(String [] args){
        int fac=facto(5);
        System.out.print(fac);
    }
}
