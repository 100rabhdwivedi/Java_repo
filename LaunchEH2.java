import java.util.Scanner;

class Alpha{
    void calc(){
        System.out.println("Connection alpha");
        try{

            System.out.println("Enter the value of numerator");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            System.out.println("Enter the value of denominator");
            int d = scan.nextInt();

            int res = n/d;
            System.out.println(res);
        }catch(ArithmeticException e){
            System.out.println("Enter non zero value:");
        }
            System.out.println("close alpha");
    }
}
class Beta{
    void call(){
        System.out.println("Connect beta");
        Alpha a = new Alpha();
        a.calc();
        System.out.println("close beta");
    }
}
public class LaunchEH2 {
    public static  void main(String args[]){
        System.out.println("Inside main");
        Beta b = new Beta();
        b.call();
        System.out.println("close main");
    }
}
