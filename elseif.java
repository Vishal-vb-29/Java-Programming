import java.util.Scanner;

public class elseif {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>18) System.out.println("Adult");
        else if(age>16 && age<=18) System.out.println("Teenage");
        else System.out.println("Child");
    }
}
