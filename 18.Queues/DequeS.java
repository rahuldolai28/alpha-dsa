
import java.util.Deque;
import java.util.LinkedList;

public class DequeS {
    
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public void push (int data){
            deque.addLast(data);
        }
        public int pop(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }
        public void print(){
            System.out.println(deque);
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2);
        s.push(1);
        s.push(4);
        s.pop();
        s.print();
    }
}
