
import java.util.Stack;

/**
 * Created by Intellij
 * User: ttwl
 * Date: 2017/8/21
 * Time: 12:26
 */
public class ImplementQueueusingStacks {
    class MyQueue {
        Stack<Integer> queue = new Stack<>();
        /** Initialize your data structure here. */
        public MyQueue() {
            //Stack<Integer> stack = new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            Stack<Integer> tempStack = new Stack<>();
            while(!queue.isEmpty())
                tempStack.push(queue.pop());
            queue.push(x);
            while(!tempStack.isEmpty())
                queue.add(tempStack.pop());
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            return queue.pop();
        }

        /** Get the front element. */
        public int peek() {
            return queue.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
