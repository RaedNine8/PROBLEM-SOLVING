import queue_and_stack_contest.ProblemH;
import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
        // 1) Which problem to run? e.g. "H" for ProblemH
        String problem = args.length > 0 ? args[0] : "H";

        // 2) Which input file? default = input.txt in project root
        String inputPath = args.length > 1 ? args[1] : "input.txt";
        Scanner in = new Scanner(Files.newInputStream(Paths.get(inputPath)));
        PrintStream out = System.out;

        // 3) Dispatch
        switch (problem) {
            case "H":
                ProblemH.solve(in, out);
                break;
            // case "A": ProblemA.solve(in, out); break;
            // case "B": ProblemB.solve(in, out); break;
            // … add your new problems here …
            default:
                out.println("Unknown problem: " + problem);
        }

        in.close();
    }
}