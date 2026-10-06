abstract class Calc{
    abstract void add(int a,int b);
    abstract void sub(int a,int b);
    void show(){
        System.out.println("Concrete method");
    }
    Calc(){
        System.out.println("Abstract class constructor");
    }
}

class Work extends  Calc{

    void add (int a, int b){
        int res = a+b;
        System.out.println(res);
    }
    void sub(int a, int b){
        int res = a-b;
        System.out.println(res);
    }

}

public class LaunchAbstract{

    public static void main(String args[]){
        Calc c = new Work();
        c.add(10, 20);
        c.sub(80, 20);
        c.show();
    }

}