package Introduction;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Vector;

public class VectorExample {

    public static void main (String [] args)
    {
        // Declaring the vector

        Vector<Integer> v1 = new Vector<Integer>();

        for (int i =1; i <=5; i++)
            v1.add(i);

        // printing elements
        System.out.println(v1);

        // removing elements at Index 3
        v1.remove(3);

        // Displaying the list after deletion
        System.out.println(v1);

        // Printing elemenys one by one
        for (int i =0; i<v1.size();i++)
            System.out.print(v1.get(i)+ " ");
    }

}
