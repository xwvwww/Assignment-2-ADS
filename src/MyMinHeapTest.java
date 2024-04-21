public class MyMinHeapTest {

    public static void main(String[] args) {
        testAddPoll();
        // Add more test cases
    }

    public static void testAddPoll() {
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        assert heap.isEmpty();
        heap.add(3);
        heap.add(1);
        heap.add(2);
        assert !heap.isEmpty();
        assert heap.peek().equals(1);
        assert heap.poll().equals(1);
        assert heap.size() == 2;
    }

    // Add more test cases for other methods
}
