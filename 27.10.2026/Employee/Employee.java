class Employee{
	int id;
	String name;
	double basicsalary;
	double bonus;
	double netsalary;
	
	void SetEmployee(){
		id=2000;
		name="raja";
		basicsalary=100000;
	}
		
	void calcbonus(){
		if(basicsalary>100000){
			bonus=basicsalary*0.10;
		}else{
			bonus=basicsalary*0.05;
		}
	}	
	
	void display(){
		netsalary=basicsalary+bonus;
		System.out.println("bonus:"+bonus);
		System.out.println("netsalary:"+netsalary);
		System.out.println("name:"+name);
		System.out.println("id:"+id);
	}


	
		
		
		


}