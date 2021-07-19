package inheritencepack;

public class Subclass extends Superclass{
	private int y;
	
	public void setValues(int a , int b) {
	setValues(a);
		this.y= b;
		}
	
	public void printsub() {
	printsuper();
		System.out.println("Print y from sub " + y);
		
	}
	
}