import java.util.Scanner;

public class switchcalc {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a= sc.nextInt();
        System.out.print("Enter value of a : ");
        int b=sc.nextInt();
        System.out.print("Enter Operator : ");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+': System.out.println(a+b);
                break;
            case '-': System.out.println(a-b);
                break;
            case '%': System.out.println(a%b);
                break;
            case '*': System.out.println(a*b);
                break;
            case '/': System.out.println(a/b);
        }
    }
    
}
