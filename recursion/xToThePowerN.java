public class xToThePowerN {
    public static int power(int x,int n){
        if(n==0) return 1;
        int pow=x*power(x,n-1);
        return pow;
    }
    public static void main(String [] args) {
        int powe=power(2,10);
        System.out.println(powe);
    }
}
