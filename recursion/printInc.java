public class printInc {
        public static void printInc(int n){
            if(n==1){
                System.out.print(1+" ");
             return ;
            }
            printInc(n-1);
            System.out.print(n+" ");
        }
        public static void main(String[] args){
        printInc(10);
        }
}
