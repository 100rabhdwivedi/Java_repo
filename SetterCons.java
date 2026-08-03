class Finishers {
    int id;
    String name;
    String city;

    Finishers() {
        super();
        System.out.println("This is a zero param constructor");
    }

    Finishers(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
        System.out.println("Param constructor");
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}

public class SetterCons {
    public static void main(String args[]) {
        Finishers f1 = new Finishers(1, "saurabh", "bengaluru");
        System.out.println(f1.getId() + f1.getName() + f1.getCity());
        System.out.println("**********************************");

        Finishers f2 = new Finishers(2, "xyz", "bengaluru");
        f2.setId(3);
        f2.setName("pappi");
        f2.setCity("rewa");
        System.out.println(f2.getId());
        System.out.println(f2.getCity());
        System.out.println(f2.getName());
        System.out.println("**********************************");

        Finishers f3 = new Finishers();
        f3.setId(4);
        f3.setName("Gaurav");
        f3.setCity("indore");
        System.out.println(f3.getId() + f3.getName() + f3.getCity());
    }
}
