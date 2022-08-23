package yogesh;

public class abc {
	
	int a=85;
	int b=2;
	int c=11;
	int d;
	int f;
	String name="accept only .pdf";
	public void xyz() {
		if(a>35) {
			System.out.println("pass");
			if(a>60) {
				System.out.println("first class");
				if(a>75) {
					System.out.println("distinction");
					
				}
			}
		}
	}
	
	protected void yogesh() {
		if(a>80) {
			System.out.println("aa");
		}else if(a>70) {
			System.out.println("bb");
		}else if(a==80) {
			System.out.println("cc");
		}
	} 
	public void nikita() {
		for(int z=11;z<=30;z=z+2) {
			System.out.println(z+1+1);
		}
		}	
	public void abcd() {
		if(name.endsWith(".pdf")) {
			System.out.println("accpet it");
		}else {
			System.out.println("does not accept");
		}
		
		for(int v=0;v<=20;v=v+2) {
		System.out.println(v);	
		}
		
	}	
		
		
		
		
		
		
		
	
	
	
	public static void main(String[] args) {
		abc z=new abc();
		//z.xyz();
	   //z.yogesh();
		//z.nikita();
		//z.abcd();
		
	}

}
