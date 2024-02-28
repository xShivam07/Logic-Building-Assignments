class Person{
	int age;
	float height;
	float weight;

	//initializing constructor
	Person(int a,float h,float w){
	age = a;
	height = h;
	weight = w;
	}

	void display(){
		
		System.out.println("The Age of the Person is " + age);
		System.out.println("The Height of the Person is " + height);
		System.out.println("The Weight of the Person is " + weight);
	}

	
	public static void main(String args[]){
		Person p = new Person(23,163,90); //first object
		Person p1 = new Person(29,183,70); //second object
		Person p2 = new Person(24,192,60); //third object
		
		p.display();
		p1.display();
		p2.display();
		

	}



}