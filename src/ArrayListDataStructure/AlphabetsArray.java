package ArrayListDataStructure;

import java.util.Scanner;

public class AlphabetsArray {
    public static void main(String args []) {
        char[] arr = new char[5];
        char[] arr1 = new char[5];
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 characters");
        for (index = 0; index < arr.length; index++) {
            arr[index] = sc.next().charAt(0);
        }
        // display
        System.out.println("The array is ");
        for (index = 0; index < arr.length; index++)
        {
            System.out.print(arr[index]+"\t");
        }
        for (int i = 0, j = 0;i<arr.length;i++,j++){
            if(Character.isLetter(arr[i]))
            {
                arr1[j] = arr[i];
            }
        }
        System.out.println("The array is = ");
        for (index =0 ;index<arr.length;index++)
        {
            System.out.print(arr1[index]+"\t");
        }
    }
}
