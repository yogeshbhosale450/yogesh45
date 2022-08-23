package yogesh;

public class static1 {
	int a=96;
	double b=66.5;
	static int c=88;
	
	
	 public void abc () {
		 System.out.println(a+" and " +b+ "  xx  "+static1.c);
	 }
	public static void xyz () {
		static1 z1=new static1();
		System.out.println(z1.a+" and "+z1.b+" and "+c);
	}
	
	public static void main(String[] args) {
		static1 z=new static1();
		z.abc();
		static1.xyz();
		
	}

}
