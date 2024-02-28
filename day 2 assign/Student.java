class Student{
	String name;
	int marks1;
	int marks2;
	int marks3;


	void totalAvg(){
		int avg = (marks1+marks2+marks3)/3;
		System.out.println("Average is: " + avg);
	}

	void display(){
		int totalmarks = marks1 + marks2 + marks3;
		System.out.println("Total marks: " + totalmarks);
		System.out.println("Student Name " + name);
	}
	public static void main(String args[]){
		Student s = new Student();

		s.name = "Shivam";
		s.marks1 = 79;
		s.marks2 = 95;
		s.marks3 = 100;

		
		s.totalAvg();
		s.display();
	}



}