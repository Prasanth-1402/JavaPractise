import java.util.ArrayList;
public class StackUsingQueue {
        ArrayList<Integer> queue1;
        int size;
        public StackUsingQueue(){
            this.queue1 = new ArrayList<>();
            this.size=size; }

        private  void enqueue(int n) { push(n); }

        private  void push(int x)    { queue1.add(x); }

        private void pop()           { queue1.remove(this.queue1.size()-1); }

        private  void dequeue()      { pop(); }

        private void display()       { System.out.println(this.queue1); }

        public static void main(String[] args) {
            StackUsingQueue s = new StackUsingQueue();
            s.enqueue(1);
            s.enqueue(2);
            s.enqueue(4);
            s.display();
            s.dequeue();
            s.display();
        }
}
