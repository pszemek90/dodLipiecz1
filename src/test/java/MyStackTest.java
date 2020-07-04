import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

/*    @BeforeEach
    void setUp() {
        MyStack stack;
    }*/

    @Test
    void shouldAddToStack() {
        //given
        MyStack stack = new MyStack();
        //when
        stack.push(5);
        String result = stack.toString();
        //then
        assertEquals("[5, 0, 0, 0, 0, 0, 0, 0, 0, 0]",result);
    }
}