import org.baotam.MyQueue;

public class MyQueueTest {


    public static void main(String [ ] args) {
        MyQueue myQueue = new MyQueue(5);

        myQueue.enqueue('5');
        myQueue.enqueue('4');
        myQueue.enqueue('3');
        myQueue.enqueue('2');
        myQueue.enqueue('1');

        while (myQueue.peek()!=0) {

            System.out.println(myQueue.dequeue());

        }
        myQueue.peek();

    }
}
