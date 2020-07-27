
import java.util.*;

public class JavaStack {
    public static void main(String[] args) {
        System.out.println("Using java.util.Stack \n");

        Stack<String> stack = new Stack<String>();

        stack.push("Akhil");
        stack.push("Boddu");
        stack.push("Asif");

        ListIterator<String> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Peeking... " + stack.peek());

        stack.push("Zolotov");
        stack.push("Harjot");

        System.out.println("Removing... " + stack.pop());

        System.out.println("Searching for Zolotov" + stack.search("Zolotov"));

        // System.out.println(stack.empty());

        iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}