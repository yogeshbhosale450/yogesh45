
public class method1 {
     int a=15;
     int b =63;
    
     public void sum () {
       	 int c= a+b;
    		 System.out.println(c);
     }
     public int mul() {
    	 int d=a*b;
    	 return d;
     }
   
     public double yogesh (double x,int y) {
    	 double v=x*y-x;
    	 return v;
    	     }
     public void k(String s) {
    	 System.out.println("word is"+s);
     }
     
     
     
     
        	public static void main(String[] args) {
	method1 abc=new method1();
	abc.sum();
	int s=abc.mul();
	System.out.println("mul is"+s);
	double r=abc.yogesh(22.5, 55);
	System.out.println("yogesh is"+r);
	abc.k("rahul");
	
	}

}
