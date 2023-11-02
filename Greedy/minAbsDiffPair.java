import java.util.Arrays;
public class minAbsDiffPair {
    public static void main(String []args){
        int arr1[]={1,2,3};
        int arr2[]={2,1,3};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int minDiff=0;
        for(int i=0;i<arr1.length;i++){
            minDiff+=Math.abs(arr1[i]-arr2[i]);
        }
        System.out.println("Min Difference is : "+minDiff);
    }
    
}
