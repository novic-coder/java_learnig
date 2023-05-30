package HashCodes;

public class Students {

    String name;
    int age;
    String gender;
    int marks;

    public Students(String name, int age, String gender, int marks) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", marks=" + marks +
                '}';
    }
}
