import java.util.Scanner;

public class largestof3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>=b && a>=c) System.out.println( a +" A is largest");
        else if(b>=c) System.out.println(b+" B is largest");
        else System.out.println(c +" C is largest");
    }
}
