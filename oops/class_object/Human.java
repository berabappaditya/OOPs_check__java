package oops.class_object;

public class Human {
    int age;
    String type;
    String gender;
    
    Human(int age){
    	System.out.println();
    }
    
    Human(){
    	System.out.println();
    }
    
    public static void main(String args[]){
        Human hm=new Human();
        hm.age=26;
        System.out.println("human age is"+hm.age);
    }
}
