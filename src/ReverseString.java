import org.baotam.MyQueue;
import org.baotam.MyStack;

public class ReverseString {


    public static void main(String[] args) {
        String input = args[0];
        String reversed = reverseString(input);
        System.out.println("Char reversed: " + reversed);


        String s = reverseStringStack(input);
        System.out.println("ReversedByStack: " + s);

        String s1 = reverseQueue(input);
        System.out.println("ReversedByQueue: " + s1);
    }

    private static String reverseQueue(String input) {
        String temp = new String();
        MyQueue myQueue = new MyQueue(input.length());

        for (int i = 0; i < input.length(); i++) {
            myQueue.enqueue(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            char pop = pop(input.length(), myQueue);
            temp += pop;
        }
        return temp;
    }

    private static char pop(int length, MyQueue myQueue) {
        char pop;
        MyQueue myQueue2 = new MyQueue(length-1);
        for (int i = 0; i < length - 1; i++) {
            char dequeue = myQueue.dequeue();
            myQueue2.enqueue(dequeue);
        }
        pop = myQueue.dequeue();
        while (myQueue2.peek() != (char)0) {
            myQueue.enqueue(myQueue2.dequeue());
        }
        return pop;
    }

    private static String reverseStringStack(String input) {
        MyStack myStack = new MyStack(input.length());
        for (int i = 0; i < input.length(); i++) {
            myStack.push(input.charAt(i));
        }
        String temp = new String();
        while (!myStack.empty()) {
            temp += myStack.pop();
        }
        return temp;
    }

    public static String reverseString(String input) {
        String temp = new String();
        char[] chars = input.toCharArray();
        int length = input.length();
        for (int index = length - 1; index >= 0; --index) {
            temp += chars[index];
        }
        return temp;
    }
}
