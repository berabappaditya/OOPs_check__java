package oops.class_object;

public class Student {
    String name;
    int rollno;
    int age;

    public void setName(String name, int rollno, int age) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Age: " + age);
    }
}
