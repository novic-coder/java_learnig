package complexsorting;

public class Student2 {

    String name;
    int age;
    int marks;

    public Student2(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }

    // We will use single clas that is studentApp2 in which Alpha class will be implemented

}
