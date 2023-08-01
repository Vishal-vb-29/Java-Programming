import java.util.Scanner;

public class leap {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter year : ");
        int year=sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0) System.out.println(year+" Leap Year");
            }
            else System.out.println(year+" Is a Leap Year");
        }
        else System.out.println(year+"Is not a Leap Year");
    }
    
}
