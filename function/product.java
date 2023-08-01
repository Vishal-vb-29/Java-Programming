package function;
import java.util.Scanner;

public class product {
    public static int multiply(int a,int b){
        int prod=a*b;
        return prod;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no : ");
        int a=sc.nextInt();
        System.out.print("Enter a no : ");
        int b=sc.nextInt();
        int produ = multiply(a,b);
        System.out.println(produ);
    }
    
}
