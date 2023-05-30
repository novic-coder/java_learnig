import java.util.Vector;

public class VectorExercise {
    // Main driver method

    public static  void main (String [] args)
    {
        int n =5;

        // Declaring the vector with Initial size

        Vector<Integer> v1 = new Vector<Integer>();

        for (int i =1; i<=n ; i++)
            v1.add(i);

        //printing elements
        System.out.println(v1);

        // removing the element

        v1.remove(3);

        // printing the elements

        System.out.println(v1);

        // Iterating over the Vector element

        for (int i=0;i<v1.size();i++)

            System.out.print(v1.get(i)+ " ");

        // various operations in vector

        // addition

    }
}
