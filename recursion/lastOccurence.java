public class lastOccurence {
    public static int lastOcc(int []arr,int key,int i){
        if(i==arr.length-1) return -1;
        int isFound=lastOcc(arr,key,i+1);
        if(isFound!=-1) return isFound;
        if(arr[i]==key) return i;
        return isFound;
    }
    public static void main(String [] args){
        int arr[]={1,2,5,0,8,5,5,5,9};
        int last=lastOcc(arr,5, 0);
        System.out.println(last);
    }
}
