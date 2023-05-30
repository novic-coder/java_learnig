package ArrayListDataStructure;

import java.util.ArrayList;

public class OperationsOnArray {
    public static void main (String [] args)
    {
        // array list

        ArrayList<String> arr1 = new ArrayList<>();

        // add elements

        arr1.add("Sachin");
        arr1.add("Saurav");

        // adding elements by using index
        arr1.add(1,"Dravid");

        // printing the elements

        System.out.println(arr1);

        // Changing the element of array - set () can be used
        System.out.println("Initial Array list " + arr1);

        // setting element at particular index

        arr1.set(1, "Rahul Dravid");

        // Updated array llist

        System.out.println("Updated array list "+ arr1);

        // removing the elements
        // remove(obj)
        // remove(int index)

        arr1.add("yiuraj");
        arr1.add("M.kaif");
        arr1.add("Irffan pathan");
        arr1.add("mahela jayvardhane");

        System.out.println(arr1);

        // removing the elements

        arr1.remove(6); // removing element at 6

        // removing by words from Arraylist

        arr1.remove("Irffan pathan");

        // printing the updted arraylist
        System.out.println("After the object removal "+arr1);

        // Iterating over the Array List

        for (int i =0; i < arr1.size(); i++){
            System.out.print(arr1.get(i)+ " ");
        }

        System.out.println();

        // using the for each loop

        for (String str : arr1)
            System.out.print(str + " ");





    }
}
