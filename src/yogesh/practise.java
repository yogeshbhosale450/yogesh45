package yogesh;

public class practise extends forloop {
	int a=5;
	int b=10;
	
	void multi() {
		
		int x=a*b;
		System.out.println("ans is  "+x);
	}
	
	public void abc() {
		if(a<b) {
			System.out.println("true");
			if(a<=b) {
				System.out.println("its also true");
				if(a>b) {
					System.out.println("hkhftd");
				}
			}
		}
		
		
	}
	
	

	public static void main(String[] args) {
		practise z=new practise();
		z.abc();
		z.multi();

	}

}
