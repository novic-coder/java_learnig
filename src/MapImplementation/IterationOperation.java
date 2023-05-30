package MapImplementation;

import java.util.HashMap;
import java.util.Map;

public class IterationOperation {

    public static void main (String [] args)
    {
        Map<String, Integer> marks = new HashMap<>();

        // Inserting the elements

        marks.put("Ravi", new Integer(100));
        marks.put("Nikita", new Integer(99));
        marks.put("Sourav", new Integer(98));
        marks.put("Sachin", new Integer(97));
        marks.put("Yuvraj", new Integer(96));

        // Iterating through the Map

        for (Map.Entry mapElement : marks.entrySet() ){
            String key = (String)mapElement.getKey();

            // finding the value

            int value = (int)mapElement.getValue();

            System.out.println(key+ " : "+ value);
        }
    }
}
