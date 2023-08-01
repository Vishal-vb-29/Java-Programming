package function;
import java.util.Scanner;

public class Product {
    public static int multiply(int a , int b){
    return a*b;
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

