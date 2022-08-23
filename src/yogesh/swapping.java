package yogesh;

public class swapping {

	public static void main(String[] args) {
		int a=60;
		int b=25;
		int c=11;
		System.out.println("print " +a+" "+b);
    
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("print swap " +a+" "+b);
		
		for(int i=c;i<=30;i++) {
			 c=i;
			if(c%2==0) {
				System.out.println("even"+c);
			}else {
				System.out.println("odd"+c);
			}
		   		}
		
		
		
		
		
		
	}

}
