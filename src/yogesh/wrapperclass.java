package yogesh;

public class wrapperclass {
	
	int a=25;
	Integer b=23;
	Character ch='b';
	
	 
	public void abc() {
		System.out.println(a);
	}
	
	public void abcd() {
		Integer s=new Integer(156);
		System.out.println(s);
		System.out.println(b);
		System.out.println(ch);
		
	}
		
		

	public static void main(String[] args) {
		wrapperclass c=new wrapperclass();
		c.abc();
		c.abcd();
		static2 z=new static2(1, "eknath shinde");
		
	}

}
