public class CallStack {

    static class Frame {
        String functionName;
        Frame next;

        Frame(String functionName, Frame next) {
            this.functionName = functionName;
            this.next = next;
        }
    }

    private Frame top = null;

    void push(String functionName) {
        top = new Frame(functionName, top);
    }

    String pop() {
        if (isEmpty())
            return "No active call";

        String name = top.functionName;
        top = top.next;
        return name;
    }

    String peek() {
        if (isEmpty())
            return "No active call";

        return top.functionName;
    }

    boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        CallStack stack = new CallStack();

        stack.push("main");
        stack.push("login");
        stack.push("validate");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}