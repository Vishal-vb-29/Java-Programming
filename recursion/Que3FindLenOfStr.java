public class Que3FindLenOfStr {
    public static int length(String str){
        if(str.length()==0) return 0;
        return length(str.substring(1)) + 1;
    }
    public static void main(String [] args){
        String str="Vishal Birla";
        int len=length(str);
        System.out.println(len);

    }
    
}
