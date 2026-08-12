class Demo2{
	static int a,b,c;
	int x,y,z;
	
	static{
	a=10;
	b=22;
	c=34;
	System.out.println("Static variables are initialized:");
}
	static void dis(){
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	System.out.println("c:"+c);
	
}
	{
	x=55;
	y=66;
	z=77;
	System.out.println("Non static variables are initialized:");
}
	Demo2(){
	System.out.println("Constructor");
}
	void dis2(){
	System.out.println("x:"+x);
	System.out.println("y:"+y);
	System.out.println("z:"+z);
}
}

class LaunchStatic2{
	public static void main(String args[]){
	Demo2.dis();
	Demo2 d1 = new Demo2();
	d1.dis2();	
}
}