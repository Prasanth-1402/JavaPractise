import java.util.ArrayList;
import java.util.List;

public class StackUsingQueue {
    List<Integer> stack ;
    int size;

    public StackUsingQueue(){                                       // Constructor
        this.stack = new ArrayList<>();
    }
        public boolean Empty(){                                     // Check for stack Emptiness
        if(stack.isEmpty())
            return true;
        return false;
        }
    public void push(int n){                                        //Pushing Value
        if(n >= 0)
            stack.add(n);
        else
            System.out.println(n +" is a Negative Value,"+" Give a Positive Value");
    }

    public int pop(){                                               //Popping Value
        if(!stack.isEmpty()){
            int length = stack.size()-1;
            return stack.remove(length);}
        return -1;
    }

    public int top(){                                               //Looking for the Top most Element in the Stack
        if(!stack.isEmpty()){
            int length = stack.size()-1;
            return stack.get(length); }
        return -1;
    }


    public static void main(String[] args) {                        // 'Main' method
        StackUsingQueue stack = new StackUsingQueue();
        System.out.println(stack.Empty());
        stack.push(3);
        stack.push(8);
        stack.push(4);
        stack.push(7);
        System.out.println(stack.Empty()+", that it an Empty Stack");
        System.out.println(stack.top()+" is the Top Element in the stack Right now");
        System.out.println(stack.pop()+" is Popped Out");
        System.out.println(stack.top()+" is the Top Element in the stack Right now");
        System.out.println(stack.pop()+" is Popped Out");
        stack.push(12);
        System.out.println(stack.stack);
        System.out.println(stack.pop()+" is Popped Out");
        System.out.println(stack.top()+" is the Top Element in the stack Right now");
        System.out.println(stack.Empty()+", that it an Empty Stack");
        System.out.println(stack.Empty());
    }
}
