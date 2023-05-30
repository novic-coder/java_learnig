package ArrayListDataStructure;

import java.util.ArrayList;

public class Introduction {
    public static void main(String[] args) {
        // Size of the array list

        int n = 5;

        // Declarinng the Arraylist with initial size

        ArrayList<Integer> arrList = new ArrayList<>(n);

        // Appending new elements in array list

        for (int i =0; i<=n; i++)
            arrList.add(i);


        System.out.println(arrList);

        // removing one element from array list

        arrList.remove(3);
        System.out.println(arrList);

        // Printing the value one b y one

        for (int i =0; i< arrList.size(); i++)
            System.out.print(arrList.get(i)+ " ");

    }
}
