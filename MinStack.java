import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;
import org.w3c.dom.ranges.RangeException;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: tanweiliang
 * Date: 2017/11/11
 * Time: 下午1:52
 *  应该存储两个栈顶元素与最小元素的差值，否则要一遍遍的遍历栈元素去寻找最小值！！
 */
public class MinStack {
    Stack<Integer> stack;
    long min;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<Integer>();
    }

    public void push(int x) {
        if (stack.isEmpty())
        {
            stack.push(x);
            min = x;
        }
        else{
            if (min>x)min = x;
            stack.push(x);
        }
    }

    public void pop() {
        if (stack.isEmpty())return;
        if (stack.pop()== min)min = Integer.MAX_VALUE;

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return (int)min;
//        Stack<Integer> stackHelper = new Stack<>();
//        int minElement = stack.peek();
//        int size = stack.size();
//        for (int i = 0; i <size; i++) {
//            int peekELement = stack.pop();
//            if (minElement > peekELement)minElement = peekELement;
//            stackHelper.push(peekELement);
//        }
//        for (int i = 0; i <size ; i++) {
//            stack.push(stackHelper.pop());
//        }
//        //System.out.println(stack);
//        return minElement;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
    }
}
