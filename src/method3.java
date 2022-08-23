

public class method3 extends method1{
 int a=33;
 double b;
 boolean c;
        public void sum() {
          float d=66.3f;
          int e=33;
          System.out.println(a);
          System.out.println(b);
          System.out.println(c);
      	double f=a+b+e;
      	System.out.println(f);
        }
 
        public void yogesh() {
        	int a= 22;
        	double b=23.5;
            	double h=a+b;
    System.out.println(h); 
    double g=this.a+this.b;
    System.out.println(g);
        }
 
 
 
	public static void main(String[] args) {
		method3 z=new method3();
		//z.yogesh();
		//z.sum();
		System.out.println(z.mul());
		
	}
	
}
