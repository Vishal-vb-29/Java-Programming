public class firstOccurence {
    public static int firstOcc(int []arr,int key,int i){
        if(i==arr.length-1) return -1;
        if(arr[i]==key) return i;
        return firstOcc(arr,key,i+1);
    }
    public static void main(String [] args){
        int arr[]={1,2,5,0,8,9};
        int chck= firstOcc(arr,5,0);
        System.out.println(chck);
    }
    
}
