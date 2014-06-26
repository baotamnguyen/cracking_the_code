package org.baotam;

public class MyStack implements Cloneable {
    private char[] chars;
    private int index;
    private int stackSize;


    public MyStack(int size) {
        stackSize = size;
        chars = new char[stackSize];
        index = -1;
    }

    public char pop() {
        char value = 0;
        if (chars != null) {
            try {
                value = chars[index];
                index--;
                stackSize = index + 1;
                char[] chars1 = new char[stackSize];
                System.arraycopy(chars,0,chars1,0,stackSize);
                chars = chars1;
                return value;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return value;
    }

    public void push(char input) throws ArrayStoreException {
        if (chars != null && index < stackSize-1) {
            if(index<=stackSize-1){
                index++;
            }
            chars[index] = input;
        }

    }

    public char peek() {
        if (chars != null) {
            return chars[index];
        } else {
            return 0;
        }
    }

    public boolean empty() {
        return chars != null && index == -1;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
