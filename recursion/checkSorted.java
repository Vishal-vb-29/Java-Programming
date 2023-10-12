public class checkSorted {
    public static boolean checkSort(int arr[],int i){
        if(i==arr.length-1) return true;
        if(arr[i]>arr[i+1]) return false;
        return checkSort(arr, i+1);
    }
    public static void main(String [] args){
        int arr[]={1,2,5,0,8,9};
        boolean chck=checkSort(arr,0);
        System.out.println(chck);
    }
}
