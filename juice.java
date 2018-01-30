package practice;

public abstract class juice {
	
	public void  apple() {
		System.out.println("apple juice");
	}

}
 class freshjuice extends juice{
	 public void ornage() {
		 System.out.println("freshjuice");
	 }
	
}
 class demo{
	 public static void main(String[]agrs) {
		 freshjuice f=new freshjuice();
		 f.apple();
		 f.ornage();
		 
	 }
 }
