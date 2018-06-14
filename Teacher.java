
import java.util.Scanner;

public class Teacher  {

	Teacher(String name, String university, String cousre) {
	//	super(name, university, cousre);
		// TODO Auto-generated constructor stub
	}

	/*Teacher() {
	
	    System.out.println("TeacherClass");
	}*/
	
	public static void main(String[] args) {
	
	/*	Student s = new Student();*/
	/*	Teacher t = new Teacher();*/
	/*ArrayList<Student> list = Student.list;*/
		Scanner sc = new Scanner(System.in);
		
	Student s;
	s = new Student("Aman Garg","123","Inderprastha","B.tech",123,false);
	s.setAttendence(true);
	Student.list.add(s);
	Student s2 =  new Student("Logan","123","Inderprastha","B.tech",123,false);
	Student.list.add(s2);
	
	/*DynamicArray a = new DynamicArray();
	a.add();
	a.size();
	a.get();
	a.set();
	a.remove();*/
/*	DynamicArray a = new DynamicArray();
	
	a.add(1);
	a.get(-1);
	a.set(0,10);
	a.remove();
	a.size();*/
	
	for(int i = 0; i < 10; i++) {
		 
		/*if(i % 5 ==0 ) {
			break;
		}*/
		if(i % 5 == 0) {
			continue;
		}
	}
	
	
	
	for(Student s1 : Student.list) {
		System.out.println(s1.student_name + " " + s1.attendence);
	}
	/*String name =	s.student_name;*/

	}

}
