import java.util.*;
public class ddeque {
    public static void main(String[] args){
        Deque<Integer> deque=new LinkedList<Integer>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        System.out.println("First element = "+ deque.getFirst());
        System.out.println("Last Element = "+deque.getLast());

    }
}
