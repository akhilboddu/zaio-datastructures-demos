class StackArray {

    // instance variables
    private String[] stackArray;
    private int top;

    // constructor
    public StackArray(int n) {
        System.out.print("Creating StackArray\n");
        stackArray = new String[n];
        top = -1;
    }

    public void push(String val) {
        top = top + 1;
        stackArray[top] = val;
    }

    public int size() {
        return (top + 1);
    }

    public boolean empty() {
        return (top == -1);
    }

    public String peek() {
        return stackArray[top];
    }

    public String pop() {
        String removingValue = stackArray[top];
        top -= 1;
        return removingValue;
    }

    public void print() {
        System.out.print("Top of stack");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i]);
            System.out.print("\n");
        }
        System.out.print("End of stack");
    }

    public static void main(String[] args) {
        System.out.println("Creating Stack using Array");

        StackArray stack = new StackArray(10);
        stack.push("Akhil");
        stack.push("Boddu");
        stack.push("Asif");

        System.out.println("Peeking... " + stack.peek());

        stack.push("Zolotov");
        stack.push("Harjot");

        stack.print();

        System.out.println("Removing... " + stack.pop());

        // System.out.println(stack.empty());

        stack.print();

        System.out.println("Size of Array " + stack.size());

    }
}