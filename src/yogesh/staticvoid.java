package yogesh;

public class staticvoid {
    int a=30;
     static int b=36;
    
    public static void abc() {
    	System.out.println("i am don");
       
    	    }
  
    public static void abcd() {
    	int a=666;
    	b=222;
    }
    
   
	public static void main(String[] args) {
		//staticvoid.abc();
		//abc();
		staticvoid s=new staticvoid();
		s.abc();
		staticvoid s1=new staticvoid();
		s1.abcd();
		System.out.println(s.a +"  "+s.b);
	}

}
