class Addition{
	int add(int a,int b){
		return a+b;
	}
	double add(int a,double b){
		return a+b;
	}
	double add(int a,int b,int c){
		return a+b+c;
	}
}

public class Main{
	public static void main(String []args){
		int a = 10;
		int b = 30;
		int c = 50;
		double x = 20.0;
		
			
		Addition ad = new Addition();
		System.out.println(ad.add(a,b));
		System.out.println(ad.add(a,x));
		System.out.println(ad.add(a,b,c));
		
			
	}
}