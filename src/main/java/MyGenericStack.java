import java.util.Arrays;

public class MyGenericStack<T> {
    public final int INITIAL_SIZE = 10;

    private Object[] objects;
    private int currentElement = 0;

    public MyGenericStack() {
        objects = new Object[INITIAL_SIZE];
    }

    public void push(T element){
        if(isFull()){
            expandStack();
        }
        objects[currentElement] = element;
        currentElement++;
    }

    private void expandStack() {
        Object[] largerInts = new Object[objects.length*2];
        for (int i = 0; i < objects.length; i++) {
            largerInts[i] = objects[i];
        }
        objects = largerInts;
    }

    public T pop() throws EmptyStackException {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        /*int result = ints[currentElement];
        currentElement--;*/
        return (T)objects[--currentElement];
    }

    public T peek() throws EmptyStackException{

        if(isEmpty()){
            throw new EmptyStackException();
        }

        Object object = objects[--currentElement];
        currentElement++;
        return (T) object;
    }

    public int size(){
        return currentElement;
    }

    public boolean isEmpty(){
        return currentElement == 0;
    }

    public boolean isFull(){
        return currentElement == objects.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(objects);
    }
}
