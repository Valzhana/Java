package seminar4;

import java.util.*;


public class task2 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Collections.addAll(list, "apple", "pineapple", "pine", "orange", "lemon");
        System.out.println(list);
        Stack<String> stack = new Stack<>();
        stack.addAll(list);
        list.clear();
        while (!stack.empty())
            list.add(stack.pop());
        System.out.println(list);
    }
}
