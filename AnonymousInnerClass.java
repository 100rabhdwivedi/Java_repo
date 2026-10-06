class A{
    void show(){
        System.out.println("Simple class methodes");
    }
    void hii(){
        System.out.println("hii");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("Now anonymous ");
            }
            public  void hii(){
                System.out.println("Hello");
            }
        };
        obj.show();
        obj.hii();

        new A().show();
    }
}
