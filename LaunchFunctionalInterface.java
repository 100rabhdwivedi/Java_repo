// abstract class A{
//     abstract void show();
// }

interface B {
    void show();
}
public class LaunchFunctionalInterface {
    public static void main(String[] args) {
        // A obj = new A(){
        //     public void show(){
        //         System.out.println("In show");
        //     }
        // };
        // obj.show();
        
        B obj = () -> System.out.print("Inside interface show");
        obj.show();
    }
}
