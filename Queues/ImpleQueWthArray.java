public class ImpleQueWthArray{
    public class Queue{
        static int arr[];
        static int rear;
        static int size;
        static int front;

        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front==-1) front=0;
            rear=(rear+1)%size;
            arr[rear]=data;
        
        }
        public static int remove(){
            
        }
    }
}