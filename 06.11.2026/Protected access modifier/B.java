package packB;
import packA.A;
public class B extends A{
	public int y;
	public B(int x,int y){
		super (x);
		this.y=y;
	}
	public void gety(){
		super.getx();
		System.out.println("By"+this.y);
	}
	


}