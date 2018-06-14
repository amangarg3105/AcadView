import java.util.ArrayList;

public class Student {

	static ArrayList<Student> list = new ArrayList<>();
	protected String  student_name = "Student";
	String phn_no = "xxxxxxxxxxx";
	String university=  "Chitkara University";
	String course = "B.Tech" ;
	double rollNo = 123456;
	boolean attendence = false;
	float f;
	
     Student() {
    	 
     }
	
	    Student(String name, String university,String cousre) {
	    	super();
	    	
	}
	       
	       
	 Student(String student_name, String phn_no, String university, String course, double rollNo,
				boolean attendence) {
		
			this.student_name = student_name;
			this.phn_no = phn_no;
			this.university = university;
			this.course = course;
			this.rollNo = rollNo;
			this.attendence = attendence;
		}


	public void setName(String student_name) {
		this.student_name = student_name;  // s.name = name
	}

	public void setStudent_name(String student_name) {
     student_name = student_name;
	}

	public void setPhn_no(String phn_no) {
		phn_no = phn_no;
	}
 
	public void setUniversity(String university) {
		university = university;
	}




	public void setCourse(String course) {
		course = course;
	}


	public void setRollNo(double rollNo) {
		rollNo = rollNo;
	}

	public void setAttendence(boolean attendence) {
		this.attendence = attendence;
	}




	public static void main(String[] args) {
		
		Student s;
		s = new Student("Aman Garg","123","Inderprastha","B.tech",123,false);
		Student.list.add(s);
		
		Student s2 =  new Student("Logan","123","Inderprastha","B.tech",123,false);
		Student.list.add(s2);
		/*s.setAttendence(true);
		
		Student s1 = new Student("xyz", "open", "Online");*/
		System.out.println("adrress " +s);
		System.out.println(s.student_name + " "  + s.phn_no + " " + s.attendence);
		s.setName("Aman Garg");
		s.setCourse("B..Tech");
		s.setAttendence(false);
		
		
		
		
		System.out.println(s.f);
		/*Student s = new Student();*/

	}

}
