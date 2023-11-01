import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class queueReversal {
    public static void queRev(Queue<Integer> q){
        Stack<Integer> st=new Stack<>();
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
    }
    public static void main(String [] args){
        Queue<Integer> qr=new LinkedList<>();
        qr.add(1);
        qr.add(2);
        qr.add(3);
        qr.add(4);
        qr.add(5);
        queRev(qr);
        while(!qr.isEmpty()){
            System.out.print(qr.remove());
        }
        System.out.println();

    }
}
