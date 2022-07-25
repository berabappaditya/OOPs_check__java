# OOPs With java

## class

```java
class Human{
       int age;
       String type;
       String gender;
       public static void main(String args[]){
          Human hm=new Human();
          hm.age=26;
          System.out.println(hm.age);
      }
  }
```

## object

```java
public class Human{
       int age;
       String type;
       String gender;
       void walk(){
        System.out.println("I am walikng");

        }

       public static void main(String args[]){
          Human hm=new Human();
          hm.age=26;
          System.out.println(hm.age);
      }
  }


```

## Inheritance

## Polymorphism

```java
    import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".

class Human {
    static int age;
    static String gender;

    Human(int age) {
        Human.age = age;
    }

    Human(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    static void print() {
        System.out.println("My age is" + age);
        if (gender != null) {
            System.out.println("My gender is " + gender);
        }
    }
}

class Student extends Human {
    int roll;

    Student(int n) {
        super(n);

    }

    Student(int n, String str) {



```

## Encapsulation

## Abstraction

## Interface
