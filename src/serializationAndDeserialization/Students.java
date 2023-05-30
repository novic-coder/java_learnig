package serializationAndDeserialization;

import java.io.Serializable;

public class Students implements Serializable {

    String name;
    int age;
    String city;
    String gender;
    int marks;

    public Students(String name, int age, String city, String gender, int marks) {
        super();
        this.name = name;
        this.age = age;
        this.city = city;
        this.gender = gender;
        this.marks = marks;
    }

    // Display method

    public void display(){
        System.out.println("The Student name is "+name);
        System.out.println("The student age is "+age);
        System.out.println("The Student city is "+city);
        System.out.println("The Student gender is "+gender);
        System.out.println("The Student marks is "+marks);
    }
}
