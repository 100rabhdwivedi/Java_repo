class Lambda{
    // class Inner{
    //     void show(){
    //         System.out.print("inner class");
    //     }
    // }
    static  class Inner{
        void show(){
            System.out.print("inner class");
        }
    }
}
public class LaunchLambda{
    public static void main(String[] args) {
        // Lambda la = new Lambda();
        // Lambda.Inner obj = la.new Inner();
        Lambda.Inner obj = new Lambda.Inner();

        obj.show();
    }
}