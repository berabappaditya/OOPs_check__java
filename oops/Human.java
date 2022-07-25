
public class Human {
int age;
String Gender;

public void Walk() {
	System.out.println("I am walking");
}
Human(){
	
}


public static void main(String args[]) {
	Student st=new Student(10);
	System.out.println(st.study);
	st.Walk();
}
}

class Student extends Human{
	int study;
	Student(int study){
		this.study=study;
	}
}
