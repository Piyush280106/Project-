import java.util.*;

class Student{
	String first_name,last_name;
	int prn_no;
	int mark1,mark2,mark3;
	float avg;
	
	Student(){
		first_name = "";
		last_name = "";
	        prn_no = 0;
		mark1 = 0;
		mark2 = 0;
		mark3 = 0;
	}

	Student(String f_name, String l_name,int r, int m1,int m2,int m3){
		first_name = f_name;
		last_name = l_name;
	        prn_no = r;
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;
	}

	Student(Student s){
		first_name = s.first_name;
		last_name = s.last_name;
	        prn_no = s.prn_no;
		mark1 = s.mark1;
		mark2 = s.mark2;
		mark3 = s.mark3;
	}
	
	public float calAvg(){
		avg = (mark1+mark2+mark3)/3;
		return avg;
	}

	public void display(){
		System.out.println("Object data:");
		System.out.println("Name = "+first_name+" "+last_name);
		System.out.println("PRN no = "+prn_no);
		System.out.println("Marks = "+mark1+" "+mark2+" "+mark3);
		System.out.println("Average = "+calAvg());
		System.out.println("Total marks = "+"300");
		System.out.println();
	}

}
class StudTest{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.display();
		Student s2 = new Student("Sintu","Prasad", 45, 95, 65, 70);
		s2.display();
		Student s3 = new Student(s2);
		s3.display();
	}
}