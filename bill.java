import java.util.Scanner;

public class bill {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float pen=sc.nextFloat();
        float pencil=sc.nextFloat();
        float eraser=sc.nextFloat();
        float total=pen+pencil+eraser;
        System.out.println("Bill with out tax :" + total);
        float gst=total*(0.18f);
        float bill= total+gst;
        System.out.println("Bill with 18% tax :" +bill);
    }
    
}
