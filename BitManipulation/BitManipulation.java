public class BitManipulation{
    public static int getIthBit(int n, int i){
        int BitMask=1<<i;
        if((n&BitMask)==0) return 0;
        else return 1;
    }
    public static int setIthBit(int n,int i){
        int Bitmask = 1<<i;
        return n|Bitmask;
    }
    public static int clearIthBit(int n,int i){
        int Bitmask = ~(1<<i);
        return n&Bitmask;
    }
    public static int updateIthBit(int n,int i,int bit){
        if(bit==0){
            return clearIthBit(n,i);
        }else
            return setIthBit(n,i);
    }
    public static int ClearIBits(int n,int i){
        int BitMask=(~0)<<i;
        return n&BitMask;
    }
    public static int ClearRangeIBits(int n,int i,int j){
        int a=~(0)<<(j+1);
        int b=(1)<<(i-1);
        int BitMask=a|b;
        return n&BitMask;
    }
    public static int CountSetBits(int n){
        int count=0;
        while(n>0){
        if((n & 1)!=0){
            count++;
            n=n>>1;
        } 
        else n=n>>1;    
        }
        return count;
    }
    public static Boolean PowerOfTwo(int n){
        return (n&(n-1))== 0;
    }
    public static int FastExponent(int n,int c){
        int ans=1;
        int a=n;
        while(c>0){
            if((c&1)==1){ ans=ans*a;
                c=c>>1;}
            else{
                    ans=ans*1;
                    c=c>>1;
            }
                a=a*a;
        }
        return ans;

    }
    public static void main(String args[]){
    System.out.println(getIthBit(10,3));
    System.out.println(setIthBit(10,1));
    System.out.println(clearIthBit(10,2));
    System.out.println(updateIthBit(10,1,1));
    System.out.println(ClearIBits(10,2));
    System.out.println(ClearRangeIBits(10,2,4));
    System.out.println(CountSetBits(15));
    System.out.println(PowerOfTwo(16));
    System.out.println(FastExponent(3,3));
}
}