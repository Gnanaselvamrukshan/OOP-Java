class B extends A{
	
	int y;
	B(){
		this.y=70;
	}
	void gety(){
		super.getx();
		System.out.println("By:"+this.y);
		
	}
	void getx(){
		//int x=500;
		System.out.println("Bx:"+this.x);
		System.out.println("Ax:"+super.x);
		System.out.println("local:"+x);
	}
	
	
}