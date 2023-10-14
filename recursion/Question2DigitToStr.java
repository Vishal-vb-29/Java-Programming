public class Question2DigitToStr {
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigToStr(int n){
        if(n==0) return;
        int lastdigit=n%10;
        printDigToStr(n/10);
        System.out.print(digits[lastdigit]+" ");
    }
    public static void main(String [] args){
        printDigToStr(1947);
    }    
}
