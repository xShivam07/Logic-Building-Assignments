class Box{
	
	float height;
	float width;
	float breadth;

	//initializing constructor
	Box(float h,float w,float b){
	height = h;
	width = w;
	breadth = b;
	}

	void getArea(){
		float area = 2*((height*breadth)+(width * breadth)+(width * height));
		System.out.println("Area of box is " + area);
	}

	void getVolume(){
		float vol = height * width * breadth;
		System.out.println("Volume of box is " + vol);
	}

	
	public static void main(String args[]){
		Box b = new Box(2,5,9); //first object
		

		
		b.getArea();
		b.getVolume();
		
		Box b1 = new Box(8,7,10); // 2nd Object

		b1.getArea();
		b1.getVolume();

	}



}