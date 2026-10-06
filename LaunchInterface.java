interface Demo{
    int add(int a , int b);
    int sub (int a, int b);
    int age = 20;
}

interface Demo2{
    int mul(int a , int b);
    int div (int a, int b);
}

class Calc implements  Demo,Demo2{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a , int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a , int b){
        return a/b;
    }

}

public class LaunchInterface {
    public static void main(String[] args) {
        Calc c= new Calc();
        System.out.print(c.add(10, 20));
        System.out.print(Demo.age);
        
    }
}
