class B extends A{
	int y;
	B(){
		this.y=70;
	}
	void getX(int y){
		System.out.println("By:"+this.y);
		System.out.println("Bylocal:"+y);
	}
	void getX(){
		System.out.println("Bx:"+this.x);
	}
}