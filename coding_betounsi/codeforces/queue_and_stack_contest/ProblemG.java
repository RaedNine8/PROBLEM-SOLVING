package queue_and_stack_contest;

import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class ProblemG {

        /**
     * CF “Plug‑in”:
     * Repeatedly remove any two equal consecutive letters.
     * Final result is the string after all possible removals.
     */
    public static void solve(Scanner in, PrintStream out) {
        String s = in.nextLine();
        Deque<Character> st = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == c) {
                st.pop();
            } else {
                st.push(c);
            }
        }
        // st holds the remaining chars *in reverse* (top is last char).
        StringBuilder sb = new StringBuilder();
        Iterator<Character> it = st.descendingIterator();  
        while (it.hasNext()) {
            sb.append(it.next());
        }
        out.println(sb.toString());
    }
}