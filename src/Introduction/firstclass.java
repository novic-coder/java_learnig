package Introduction;

import java.util.Hashtable;
import java.util.Vector;

public class firstclass {

    // before collection framework the standard method for grouping java objects were arrays or vectors or Hashtables
    // they had no common Interfaces
    //Implementation was different although the aim was same
    public static void main (String [] args)
    {
        // creating Instances for array,Vector,Hash
        int arr [] =  new int[] {1,2,3,4,};
        Vector<Integer> v1 = new Vector<>();
        Hashtable<Integer,String> h1 = new Hashtable<>();


        // Adding the elements into the vector
        v1.addElement(1);
        v1.addElement(2);


        // Adding the element in Hashtable
        h1.put(1, "Ravi");
        h1.put(2, "Ranjan Kumar");

        // Accessing the element of array, vector and Hashtable

        System.out.println(arr[0]);
        System.out.println(v1.elementAt(0));
        System.out.println(h1.get(1));

    }
}
