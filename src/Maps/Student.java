package Maps;

public class Student {

    String name;
    int age;
    String city;
    String gender;
    String email;
    int marks;
    long mobile;

    public Student(String name, int age, String city, String gender, String email, int marks, long mobile) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.gender = gender;
        this.email = email;
        this.marks = marks;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", marks=" + marks +
                ", mobile=" + mobile +
                '}';
    }
}
