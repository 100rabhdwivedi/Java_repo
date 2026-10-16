import java.util.ArrayList;

class Human {
    int age;

    public void disp(){
        System.out.println("Humans are the best creature ");
    }
}

class Students extends Human{

}
class Employee{

}
public class LaunchGenerics3 {
    public static void main(String[] args) {
        // Object obj = new Object();
        // String s = new String("xyz");
        // obj = s; //allowed
        // s=obj; // x

        // Human h = new Human();
        // Students s = new Students();
        // h = s; //allowed
        // s=h; //x

        // ArrayList<Human> hlist1 = new ArrayList<>();
        // ArrayList<Students> slist1 = new ArrayList<>();
        // hlist1 = slist1; //x
        // slist1 = hlist1 ; //x

        // ArrayList<?> hlist2 = new ArrayList<>();
        // ArrayList<Students> slist2 = new ArrayList<>();
        // hlist2 = slist2; //allowed
        // slist2 = hlist2 ; //x

        // ArrayList<? extends Human> hlist3 = new ArrayList<>();
        // ArrayList<Students> slist3 = new ArrayList<>();
        // ArrayList<Object> olist3 = new ArrayList<>();
        // hlist3 = slist3; //allowed
        // hlist3 = olist3; //x

        // ArrayList<? super Employee> emp = new ArrayList<>();
        // ArrayList<Human> hlist4 = new ArrayList<>();
        // ArrayList<Object> olist4 = new ArrayList<>();
        // emp = olist4; //allowed
        // emp = hlist4;//x


    }
}
