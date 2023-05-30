package complexsorting;

public class Student1 {

    // Assending order sorting using Comparators

    String name;
    int age;
    String city;

    public Student1(String name, int age, String city) {
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

    // Class Alpha Implements Comparators
}
