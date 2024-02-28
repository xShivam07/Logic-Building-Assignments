class Room{
	float height;
	float width;
	float breadth;



	void volume(){
		float vol = height * width * breadth;
		System.out.println("Volume of the room: " +vol);
	}

	public static void main(String args[]){
		Room r1 = new Room();
		
		r1.height = 10.0f;
		r1.width = 7.0f;
		r1.breadth = 9.0f;
		r1.volume(); 
	}

	

}
