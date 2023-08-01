import java.util.Scanner;

public class function {
    public static int multiply(int a,int b){
        int prod=a*b;
        return prod;
    }
    
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int factor=fact(num);
        System.out.println(factor);
    }
}
