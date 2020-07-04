public class ParenthesisMain {
    public static void main(String[] args) throws EmptyStackException {
        String parenthesis = "{()[]{}}";
        char[] arrayFromString = parenthesis.toCharArray();
        MyGenericStack<Character> stack = new MyGenericStack<>();
        for (char c : arrayFromString) {
            stack.push(c);
        }
        System.out.println(stack);
//        System.out.println(checkParenthesis(stack));
        System.out.println(balancedAnyParens(arrayFromString));

    }

    public static boolean checkParenthesis(MyGenericStack<Character> stack) throws EmptyStackException {
        int openParenthesis = 0;
        int closeParenthesis = 0;
        if(stack.peek() != ')'){
            return false;
        }
        int size = stack.size();
        for (int i = 0; i < size - 1; i++) {
            if(stack.pop() == ')'){
                closeParenthesis++;
            } else {
                openParenthesis++;
            }
        }
        if(stack.pop() != '('){
            return false;
        } else {
            openParenthesis++;
        }
        return openParenthesis == closeParenthesis;
    }

    public static boolean balancedAnyParens(char[] array) {
        MyGenericStack<Character> stack = new MyGenericStack<>();
        int asciiParenthesis;
        for (char c : array) {
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } else {
                if(c == ']' || c == '}'){
                    asciiParenthesis = 2;
                } else {
                    asciiParenthesis = 1;
                }
                try {
                    if(c - asciiParenthesis == stack.peek()){
                        try {
                            stack.pop();
                        } catch (EmptyStackException e) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } catch (EmptyStackException e) {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }

}
