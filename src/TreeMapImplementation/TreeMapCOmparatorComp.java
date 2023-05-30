// Class 1
// Helper Class representing Student

import java.util.Comparator;
import java.util.TreeMap;

class Student {
    // Attributes of a Stuendent

    int rollno;
    String name, address;

    // Constructor

    public  Student(int rollno, String name, String address)
    {
        // This keyword refers to current object itself
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Method of this class to print student details

    public  String toString(){
        return this.rollno + " "+ this.name + " "+ this.address;
    }
}

// Class 2
// Helpers Class - Comparator Implementation

class Sortbyroll implements Comparator<Student>{

    // Used for sorting in ascending order of roll number
    public int compare (Student a, Student b)
    {
        return a.rollno- b.rollno;
    }

}

// Class 3
// Main Class

public  class TreeMapCOmparatorComp {

    // calling constructir inside main()

    static void Example2ndConstructor()
    {
        // Creating an Empty TreeMap

        TreeMap<Student, Integer> tree_map = new TreeMap<Student, Integer>(
                new Sortbyroll());

        // Mapping String Value to int Keys

        tree_map.put(new Student(111, "John", "London"),2);
        tree_map.put(new Student(222,"Nick", "America"),3);
        tree_map.put(new Student(333, "Harry","Europe"),3);
        tree_map.put(new Student(444, "Sean", "America"),4);

        // Printing the elements of TreeMap

        System.out.println("TreeMap: "+tree_map);
    }

    // Main Driver Method

    public static void main (String [] args)
    {
        System.out.println("TreeMao Using TreeMap(Comparator) Constructor : \n");

        Example2ndConstructor();
    }
}