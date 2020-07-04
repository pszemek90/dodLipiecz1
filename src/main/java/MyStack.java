import java.util.Arrays;

public class MyStack {
    public final int INITIAL_SIZE = 10;

    private int[] ints;
    private int currentElement = 0;

    public MyStack() {
        ints = new int[INITIAL_SIZE];
    }

    public void push(int element){
        if(isFull()){
            expandStack();
        }
        ints[currentElement] = element;
        currentElement++;
    }

    private void expandStack() {
        int[] largerInts = new int[ints.length*2];
        for (int i = 0; i < ints.length; i++) {
            largerInts[i] = ints[i];
        }
        ints = largerInts;
    }

    public int pop() throws EmptyStackException {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        /*int result = ints[currentElement];
        currentElement--;*/
        return ints[currentElement--];
    }

    public int peek(){
        return ints[currentElement];
    }

    public boolean isEmpty(){
        return currentElement == 0;
    }

    public boolean isFull(){
        return currentElement == ints.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(ints);
    }
}
