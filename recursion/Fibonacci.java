public class Fibonacci {
    public static int fibonacc(int n){
        if(n==0 || n==1) return n;
        int fab=fibonacc(n-1)+fibonacc(n-2);
        return fab;
    }
    public static void main(String [] args){
        int fibon=fibonacc(8);
        System.out.println(fibon);
    }
}
