class Demo{
	int num1,num2;
	Demo(){
		super();
		System.out.println("This is without parameter constructor");
	}
	Demo(int num1){
		this();
		this.num1=num1;
		num2 = 504;
		System.out.println("This is single parameter constructor");

	}
	Demo(int num1,int num2){
		this(num1);
		this.num1=num1;
		this.num2=num2;
		System.out.println("This is multi parameter constructor");

	}
void dis(){
	System.out.println(num1+" "+num2);
}
	
}

public class Constructor {
	public static void main(String args[]){
	Demo D1 = new Demo();
    D1.dis();
    System.out.println("********************************");
    Demo D2 = new Demo(10);
    D2.dis();
    System.out.println("*******************************");
    Demo D3 = new Demo(10,20);
    D3.dis();

}
}