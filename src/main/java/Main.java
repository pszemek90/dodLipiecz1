public class Main {
    public static void main(String[] args) throws EmptyStackException {
        MyStack stack = new MyStack();
        stack.push(5);
        stack.push(3);
        stack.push(1);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());


    }
}
