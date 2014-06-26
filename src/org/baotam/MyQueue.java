package org.baotam;

/*
   3.5
   Implement a MyQueue class which implements a queue using two stacks.
   enqueue,dequeue,peek,  FIFO
*/
public class MyQueue implements Cloneable {


    private MyStack forward1;
    //push,pop,peek,empty, LIFO

    private MyStack reverse1;
    private int queueSize;

    public MyQueue(int size) {
        queueSize = size;
        reverse1 = new MyStack(queueSize);
        forward1 = new MyStack(queueSize);

    }

    public char enqueue(char item) {
        forward1.push(item);

        return item;
    }

    public char dequeue() {
        while (!forward1.empty()) {
            reverse1.push(forward1.pop());
        }
        char pop = reverse1.pop();
        while (!reverse1.empty()) {
            forward1.push(reverse1.pop());
        }
        return pop;
    }

    public char peek() {
        char pop = 0;
        if (forward1 != null && !forward1.empty()) {
            MyStack clone = null;
            try {
                clone = (MyStack) forward1.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            if (clone != null) {
                while (!clone.empty()) {
                    pop = clone.pop();
                }

            }
        }
        return pop;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
