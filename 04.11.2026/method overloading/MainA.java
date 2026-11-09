class MainA{
	public static void main(String args[]){
		
		A obja1=new A();
		obja1.SetStudent();
		obja1.getStudent();
		
		A obja2=new A();
		obja2.SetStudent(2000);
		obja2.getStudent();
		
		A obja3=new A();
		obja3.SetStudent("joy");
		obja3.getStudent();
		
		A obja4=new A();
		obja4.SetStudent(4000,"ruks");
		obja4.getStudent();
		
		A obja5=new A();
		obja5.SetStudent("kithi",5000);
		obja5.getStudent();
	}
}