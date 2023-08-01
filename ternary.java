import java.util.Scanner;

public class ternary {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String type=(number%2==0) ? "EVEN" : "ODD";
        System.out.println(type);
    }
}
