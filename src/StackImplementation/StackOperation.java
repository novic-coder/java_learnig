package StackImplementation;

import java.util.Stack;

public class StackOperation {

    // Main Method

    public static void main (String [] args )
    {
        // Default Initialization of stack

        Stack stack1 = new Stack();

        // Initialization of Stock

        Stack<String> stack2 = new Stack<String>();
        // Pushing the elements

        stack1.push(4);
        stack1.push("All");
        stack1.push("Geeks");

        stack2.push("Geeks");
        stack2.push("For");
        stack2.push("Geeks");

        // Printing the stack element

        System.out.println(stack1);
        System.out.println(stack2);

        // Accessing the elements

        Stack<String> stack3 = new Stack<String>();
        stack3.push("Welcome");
        stack3.push("To");
        stack3.push("Geeks");
        stack3.push("For");
        stack3.push("Geeks");

        // Displaying the stack
        System.out.println("Initial Stack "+stack3);

        // Fetching the element at the head of the stack

        System.out.println("The element at the top of stack is "+stack3.peek());

        // Displaying the stack after final Operation

        System.out.println("Final stack: "+stack3);

        // Removing the elements

        Stack<Integer> stack4 = new Stack<Integer>();

        // pushing the elements

        stack4.push(10);
        stack4.push(20);
        stack4.push(30);
        stack4.push(40);
        stack4.push(50);

        // Displaying the element
        System.out.println("Initial stack "+stack4);

        // Removing the elements using pop() method

        System.out.println("Popped element: "+stack4.pop());

        System.out.println("Popped element : "+stack4.pop());

        // displaying after removing
        System.out.println("Stack after pop operation "+stack4);


    }
}
