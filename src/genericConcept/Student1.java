package genericConcept;

public class Student1 {
    String name;
    int age;
    String city;

    public Student1(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    // we will require to override the toString method in order to get information about the class that we have created object otherwise it will simply print the address.

}
