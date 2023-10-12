public class xToThePowerNOpt {
    public static int poweropt(int x, int n){
        if(n==0) return 1;
        int halfpower=poweropt(x, n/2);
        int halfpowersq=halfpower*halfpower;
        if(n%2!=0) halfpowersq=x*halfpowersq;
        return halfpowersq;
    }

    // Time Complexity = O(logn)
    public static void main(String[] args){
        int pow=poweropt(2, 10);
        System.out.print(pow);
    }
    
}
