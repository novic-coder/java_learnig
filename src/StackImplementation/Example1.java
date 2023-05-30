package StackImplementation;

import java.util.Stack;

public class Example1 {

    // Pushing element on top of the stack

    static void stack_push(Stack<Integer> stack)
    {
        for (int i =0; i < 5; i++)
        {
            stack.push(i);
        }
    }

    // popping the element on the top of stack

    static void stack_pop(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }

    }
        // Displaying element on the top of stack
    static  void stack_peek (Stack<Integer> stack)
    {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: "+element);
    }

    // searching elements in the stack

    static void stack_search(Stack<Integer> stack,int element)
    {
        Integer pos = (Integer) stack.search(element);

        if (pos == -1)
            System.out.println("Element Not Found");

        else
            System.out.println("Element is found at position: "+pos);
    }

    public static void main (String [] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack,2);
        stack_search(stack,6);
    }


}
