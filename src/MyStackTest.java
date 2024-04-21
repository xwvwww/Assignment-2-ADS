public class MyStackTest {

    public static void main(String[] args) {
        testPushPop();
        // Add more test cases
    }

    public static void testPushPop() {
        MyStack<Integer> stack = new MyStack<>();
        assert stack.isEmpty();
        stack.push(1);
        stack.push(2);
        assert !stack.isEmpty();
        assert stack.pop().equals(2);
        assert stack.peek().equals(1);
        assert stack.size() == 1;
    }

    // Add more test cases for other methods
}
