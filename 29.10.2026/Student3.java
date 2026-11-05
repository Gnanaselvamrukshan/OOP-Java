class Student3{
	int id;
	String name;
	int marks[];
	
	Student3(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	void setmarks(int marks[]){
		this.marks=marks;
	}
	
	int calcTotal(){
		int total=0;
		for (int i=0; i < this.marks.length; i++ ){
			total += this.marks[i];
		}
		return total;
	}
	
	double calcAverage(int total){
		double average = 0.0;
		average=total/this.marks.length;
		return average;
	}

	char getResult(double average){
		char result ='\u0000';
		if (average >= 75){
			result='A';
		}
		else if (average >=65){
			result='B';
		}
		else if (average >=55){
			result='C';
		}
		else if (average >45){
			result='D';
		}
		else{
			result = 'F';
		}
		return result;
	}
	
	String[] subjectResult(){
		String setResult[] = new String[this.marks.length];
		
		for(int i =0; i < this.marks.length; i++){
			if (this.marks[i]> 45 ){
				setResult[i] = "Pass";
			}
			else{
				setResult[i] = "Fail";
			}
		}
		return setResult;
	}
	
	void displayDetails(){
		System.out.println("Id : " + this.id);
		System.out.println("Name : " + this.name);
		
		int tot = this.calcTotal();
		System.out.println("Total : " +tot);
		
		double ave = this.calcAverage(tot);
		System.out.println("Average : " + ave);
		
		char res = this.getResult(ave);
		System.out.println("Result : " + res);
		
		String setRes[] = this.subjectResult();
		
		for (int i =0; i < this.marks.length; i++){
			System.out.println("Subject "+ (i+1) + " Mark is "+this.marks[i]+ ": " + setRes[i]);
		}
	}
}