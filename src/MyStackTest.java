import org.baotam.MyStack;

public class MyStackTest {

    public static void main(String[] args) {
        MyStack myStack = new MyStack(6);
        myStack.push('1');
        myStack.push('2');
        myStack.push('3');
        myStack.push('4');
        myStack.push('5');

        while (!myStack.empty()) {
            System.out.println(myStack.pop());
        }
    }
}
