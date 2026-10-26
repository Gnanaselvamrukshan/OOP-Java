class MainPen{
	public static void main(String args[]){
		Pen P;
		P=new Pen();
		
		P.color="red";
		P.height=10.5;
		P.weight=4.3;
		P.brand="ten";
		P.madein="sri lanka";
		
		System.out.println(P.color);
		System.out.println(P.color);
		System.out.println(P.height);
		System.out.println(P.weight);
		System.out.println(P.brand);
		System.out.println(P.madein);
		
		P.write();
	}


}