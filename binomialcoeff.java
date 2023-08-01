public class binomialcoeff {
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static int binCoeff(int n,int r){
        int fn=fact(n);
        int fr=fact(r);
        int fd=fact(n-r);
        int bc=(fn)/(fr*fd);
        return bc;
    }
    public static void main(String args[]){
        
        System.out.println(binCoeff(5,2));
    }
    
}
