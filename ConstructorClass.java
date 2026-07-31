class Learners{
	private int id;
	private String name;
	private String cls;
	
	Learners(){
		id = 67;
		name = "Gaurav";
		cls = "Bca";
	}
		
	Learners(int id,String name,String cls){
		this.id = id;
		this.name = name;
		this.cls = cls;
	}
	void setId(int id){
		this.id = id;
	}
	void setName(String name){
		this.name = name;	
	}
	void setCls(String cls){
		this.cls = cls;
	}
	
	int getId(){
		return id;
	}
	String getName(){
		return name;
	}
	String getCls(){
		return cls;
	}
}


public class ConstructorClass{
	public static void main(String []args){
	
	Learners L1 = new Learners();
	L1.setId(2);
	L1.setName("saurabh");
	L1.setCls("Mca");

	System.out.print("Id:" + L1.getId()+" ");
	System.out.print("Name:" + L1.getName()+" ");
	System.out.println("Class:" + L1.getCls());

	System.out.println("**********************************************");
	
	Learners L3 = new Learners(101,"Monkey","M1");
	System.out.println("Name:"+L3.getName()+" Id:"+L3.getId()+" Class:"+L3.getCls());

	System.out.println("**********************************************");
	
	Learners L2 = new Learners();
	System.out.println("Name:"+L2.getName()+" Id:"+L2.getId()+" Class:"+L2.getCls());



	
	
		
}
}