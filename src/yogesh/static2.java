package yogesh;

public class static2 {
   
     int no;
     String name;
     static String party="shivsena";
	
	public static2(int noo , String nam ) {
		
		this.no=noo;
		this.name=nam;
		System.out.println(no +" "+name +" "+party);
		
	}
	
	
	public static void main(String[] args) {
	 static2 z=new static2(1, "eknath shinde");
	 static2 z1=new static2(2, "bacchu kadu");
	 static2 z2=new static2(3, "pradeep jaiswal");
	}

}
