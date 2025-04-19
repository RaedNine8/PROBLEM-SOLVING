package queue_and_stack_contest;

import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;
import java.util.*;

public class ProblemF {

        /**
     * CF “Plug‑in”:
     * Repeatedly remove any two equal consecutive letters.
     * Final result is the string after all possible removals.
     */
    public static void solve(Scanner in, PrintStream out) {
     String s = in.nextLine();
     char key = ')';
     Deque<Character> stack = new ArrayDeque();
     int t = 0;
    for(char c : s.toCharArray()){
       if(!stack.isEmpty() && c  == key && stack.peek() != key ){
          stack.pop();
          t+=2;
       }else{
       stack.push(c);
       }   
      
     }

      out.println(t);
      in.close();


       }
}