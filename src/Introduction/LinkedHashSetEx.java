package Introduction;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main (String [] args)
    {
        // creating the LinkedHashset and adding element

        LinkedHashSet<String> Ihs = new LinkedHashSet<String>();

        Ihs.add("Geeks");
        Ihs.add("for");
        Ihs.add("Geeks");
        Ihs.add("is");
        Ihs.add("Very helpful");

        // Traversing the elements
        Iterator<String> itr = Ihs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
