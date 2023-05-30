package Introduction;

import java.util.Vector;

public class VectorOperation {

    public static void main (String [] args)
    {
        Vector v1 = new Vector();

        // Adding custom elements using add() method
        v1.add(1);
        v1.add(2);
        v1.add("geeks");
        v1.add("for Geeks");
        v1.add(3);

        // Printing the vector elements to the console
        System.out.println("Vector v1 is "+v1);

        // Creating one generic vector

        Vector<Integer> v2 = new Vector<Integer>();

        v2.add(1);
        v2.add(2);
        v2.add(3);

        // Printing the vector element to console

        System.out.println("Vector v2 is "+v2);


        // Updating the element

        // use set () to update

        v1.set(2,"The Geeks");
        v1.set(3, "for the geeks");

        System.out.println("The Update vector is "+ v1);

        // removing the vector element

        v1.remove(1);
        v1.remove("The Geeks");
        System.out.println(v1);

        v1.add(1,"The Geeks");
        v1.add(4);
        v1.add(5);

        // Using the get method and the for loop

        for (int i =0; i<v1.size(); i++)
            System.out.print(v1.get(i)+ " ");

        // Using for each loop

        for (Integer i: v2)
            System.out.println(i+ " ");
    }
}
