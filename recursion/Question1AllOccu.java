public class Question1AllOccu {
    public static void printAllOccu(int []arr,int key,int i){
        if(i==arr.length) return;
        if(arr[i]==key) System.out.print(i+" ");
        printAllOccu(arr,key,i+1);
    }
    public static void main(String [] args){
        int [] arr={1,2,3,4,2,4,2,5,6};
        printAllOccu(arr, 2, 0);
    }
}
