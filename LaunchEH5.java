import java.io.IOException;

class Parent {
    void work()throws Exception{
        System.out.println("Parents work hard:");
    }
}
class Child1 extends Parent{
    void work ()throws IOException{
        System.out.println("child1 also work hard");
    }
}
class Child2 extends  Parent{
    void work()throws ArithmeticException{
        System.out.println("child2 also work hard");
    }
}
public class LaunchEH5 {
    public static void main(String[] args) {
        Child2  c = new Child2();
        c.work();
    }
}
