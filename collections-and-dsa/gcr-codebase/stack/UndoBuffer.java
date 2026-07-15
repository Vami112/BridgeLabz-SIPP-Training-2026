public class UndoBuffer {
    private final String[] data;
    private int top;

    UndoBuffer(int maxDepth) {
        data = new String[maxDepth];
        top = -1;
    }

    boolean push(String edit) {
        if (top == data.length - 1)
            return false;

        data[++top] = edit;
        return true;
    }

    String pop() {
        if (isEmpty())
            return "Nothing to undo";

        return data[top--];
    }

    String peek() {
        if (isEmpty())
            return "Nothing to undo";

        return data[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        UndoBuffer stack = new UndoBuffer(3);

        stack.push("Type Hello");
        stack.push("Delete word");
        stack.push("Type Java");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}