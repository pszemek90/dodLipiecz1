public class GeneericMain {
    public static void main(String[] args) throws EmptyStackException {
        MyGenericStack<String> stringMyGenericStack = new MyGenericStack<>();
        stringMyGenericStack.push("asdas");
        stringMyGenericStack.push("dfgdf");
        stringMyGenericStack.push("werwe");
        stringMyGenericStack.push("vbnvb");
        System.out.println(stringMyGenericStack);
        stringMyGenericStack.pop();
        System.out.println(stringMyGenericStack.peek());
        stringMyGenericStack.pop();
        System.out.println(stringMyGenericStack.peek());
        stringMyGenericStack.pop();
        System.out.println(stringMyGenericStack.peek());
        stringMyGenericStack.pop();
        System.out.println(stringMyGenericStack.peek());
        stringMyGenericStack.pop();

    }
}
