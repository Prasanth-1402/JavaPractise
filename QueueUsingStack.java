import java.util.ArrayList;
import java.util.List;

public class QueueUsingStack {

        List<Integer> queue;
        int size;

        public QueueUsingStack(){                                       // Constructor
            this.queue = new ArrayList<>();
        }
        public boolean Empty(){                                     // Check for queue Emptiness
            if(queue.isEmpty())
                return true;
            return false;
        }
        public void push(int n){                                        //Pushing Value
            if(n >= 0)
                queue.add(n);
            else
                System.out.println(n +" is a Negative Value,"+" Give a Positive Value");
        }

        public int pop(){                                               //Popping Value
            if(!queue.isEmpty()){
                return queue.remove(0);}
            return -1;
        }

        public int peek(){                                               //Looking for the peek Element in the Stack
            if(!queue.isEmpty()){
                return queue.get(0); }
            return -1;
        }

        public static void main(String[] args) {                        // 'Main' method
            QueueUsingStack stack = new QueueUsingStack();
            System.out.println(stack.Empty());
            stack.push(31);
            stack.push(81);
            stack.push(41);
            stack.push(71);
            System.out.println(stack.queue);
            System.out.println(stack.Empty()+", that it an Empty Stack");
            System.out.println(stack.peek()+" is the Peek Element in the queue Right now");
            System.out.println(stack.pop()+" is Popped Out");
            System.out.println(stack.queue);
            System.out.println(stack.peek()+" is the Peek Element in the queue Right now");
            System.out.println(stack.pop()+" is Popped Out");
            System.out.println(stack.queue);
            System.out.println(stack.peek()+" is the Peek Element in the queue Right now");
            System.out.println(stack.pop()+" is Popped Out");
            System.out.println(stack.peek()+" is the Peek Element in the queue Right now");
            System.out.println(stack.queue);
            System.out.println(stack.Empty()+", that it an Empty Stack");
        }
}
