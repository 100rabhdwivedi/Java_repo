class DemoStatic{
	static int a,b,c;
	int x,y,z;
	static{
	System.out.println("Initializing the variables inside the static block");
	a=10;
	b=30;
	c=55;
}
static void dis(){
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	System.out.println("c:"+c);
}
}

public class LaunchStatic1{
	static int a;
	static{
	System.out.println("Static block inside the main class");
	a=10;
	System.out.println("a:"+a);
	
}
	public static void main(String args[]){
	DemoStatic.dis();
	
}
}