public class sumNatural {
    public static int sumNat(int n){
        
        if(n==1) return 1;
        int sumN = n + sumNat(n-1);
        return sumN;
    }
    public static void main(String [] args){
        int sum=sumNat(5);
        System.out.println("Sum of 5 natural no : "+ sum);
    }
}
