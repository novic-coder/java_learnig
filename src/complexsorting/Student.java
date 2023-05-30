package complexsorting;

public class Student implements Comparable{

    String name;
    int age;
    String city;

    public Student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public int compareTo(Object Y){
        if (this.age > ((Student)Y).age) return 1;  // Downcasting is happening

        else{
            return  -1;
        }

    }
}
