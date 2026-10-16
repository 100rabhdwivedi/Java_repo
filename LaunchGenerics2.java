import java.util.ArrayList;

class Generics<T>{
    private T ref;

    public Generics(T ref){
        this.ref = ref;
    }

    public void disp(){
        System.out.println("The type of T is :"+ref.getClass().getName());
    }

    public T getRef(){
        return ref;
    }

}
public class LaunchGenerics2 {
    public static void main(String[] args) {
        Generics<Integer> g = new Generics<>(44);
        g.disp();
        System.out.println(g.getRef());

        Generics<String> gs = new Generics<>("string something...");
        gs.disp();
        System.out.println(gs.getRef());

    }
}
