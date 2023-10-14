public class tilingProblem {
    public static int tilingP(int n){
        if(n==0 || n==1) return 1;
        int fnm1=tilingP(n-1);
        int fnm2=tilingP(n-2);
        int totways=fnm1+fnm2;
        return totways;
    }
    public static void main(String [] args){
        int ways=tilingP(4);
        System.out.print(ways);
    }
}
