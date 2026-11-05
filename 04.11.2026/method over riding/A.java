class A{
	int id;
	String name;
	
	void SetStudent(){
		this.id=1000;
		this.name="yohan";
	}
	void SetStudent(int id){
		this.id=id;
		this.name="murali";
	}
	void SetStudent(String name){
		this.id=3000;
		this.name=name;
	}
	void SetStudent(int id,String name){
		this.id=id;
		this.name=name;
	}
	void SetStudent(String name,int id){
		this.name=name;
		this.id=id;
	}
	 void getStudent(){
		System.out.println("ID:"+this.id);
		System.out.println("NAME:"+this.name);
	}
	
		
		
}	
		