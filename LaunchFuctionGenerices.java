import java.util.ArrayList;
import java.util.List;

class Human {
    String name;
    int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', age=" + age + "}";
    }
}

class Students extends Human {
    String course;

    Students(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{name='" + name +
            "', age=" + age +
            ", course='" + course + "'}";
    }
}

public class LaunchFuctionGenerices {

    public static void invoceDisp(List<? extends Human> list) {

        for (Human h : list) {
            System.out.println(h);
        }
    }

    public static void main(String[] args) {

        ArrayList<Human> hlist = new ArrayList<>();

        hlist.add(new Human("Saurabh", 23));
        hlist.add(new Human("Rahul", 25));

        ArrayList<Students> slist = new ArrayList<>();

        slist.add(new Students("Amit", 21, "MCA"));
        slist.add(new Students("Rohit", 22, "BCA"));

        invoceDisp(hlist);
        invoceDisp(slist);
    }
}