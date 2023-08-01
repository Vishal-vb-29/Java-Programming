public class typeconversion {
    public static void main(String args[]){
        int a=35;
        float b=a;
        // size of b(8 bytes) > a (4 bytes) otherwise it is error, as loosy conversion
        System.out.println(b);
    }
}
