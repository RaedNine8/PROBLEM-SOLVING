
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ProblemH {
    /** 
     * CF “Game with string”:
     * On each move remove any two equal adjacent letters. 
     * Whoever can’t move loses. 
     * First wins ⇔ total removals is odd.
     */
    public static void solve(Scanner in, PrintStream out) {
        String s = in.nextLine().trim();
        int removals = 0;
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
                removals++;
            } else {
                stack.push(c);
            }
        }
        out.println(removals % 2 == 1 ? "Yes" : "No");
    }
}