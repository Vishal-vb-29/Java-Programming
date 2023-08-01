import java.math.*;
public class binarytodecimal {
    public static void btd(int n){
        int pow=0;
        int decimal=0;
        while(n>0){
        int digit=n%10;
        decimal= decimal + (digit*(int) Math.pow(2,pow));
        pow++;
        n/=10;
        }
        System.out.println(decimal);
    }
    public static void main(String args[]){
        int n=1000;
        btd(n);
    }
    
}
