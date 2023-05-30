package Introduction;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

    // main method
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<String>();
        stack.push("I ");
        stack.push("Work ");
        stack.push("IN ");
        stack.push("PWC");
        stack.push("As ");
        stack.push("An");
        stack.push("Associate");

        //Iterator for stack

        Iterator<String> itr = stack.iterator();

        //printing the stack

        while ((itr.hasNext())){
            System.out.print(itr.next() + " ");

        }

        System.out.println();

        stack.pop();

        // Iterator for the stack

        itr = stack.iterator();

        // printing the stack

        while ((itr.hasNext())){
            System.out.print(itr.next() + "");
        }
    }
}
