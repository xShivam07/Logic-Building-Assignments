class Vehicle{
	String color;
	String model;
	float price;

	//initializing constructor
	Vehicle(String c,String m,float p){
	color = c;
	model = m;
	price = p;
	}

	void display(){
		
		System.out.println("The Price of vehicle is " + price);
		System.out.println("The Model of vehicle is " + model);
		System.out.println("The color of vehicle is " + color);
	}

	
	public static void main(String args[]){
		Vehicle v = new Vehicle("Blue","XUV700",2000000); //first object
		

		
		v.display();
		

	}



}