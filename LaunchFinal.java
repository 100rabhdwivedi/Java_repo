class First {
	 String name = "saurabh";
	final void add(String name){
	this.name = name;
	System.out.println("Name has given:");
}
	final void show(){
		System.out.println(name);
	}
}

class Second extends First{
	int age = 21;
	void set(int age){
		this.age = age;
		System.out.println("Age has given:");
	}
	void get(){
	System.out.println(age);
}
}

public class LaunchFinal{
public static void main(String args[]){
	Second s1 = new Second();
	s1.set(20);
	s1.add("meow");
	s1.get();
s1.show();
System.out.println(s1.name);
}
}