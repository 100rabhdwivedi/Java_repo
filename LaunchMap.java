import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Passport{
    String name ;
    String city;
    String country;

    Passport(String name, String city,String country){
        this.name = name ;
        this.city = city;
        this.country = country;
    }

}
class LaunchMap{
    public static void main(String[] args) {
        Passport p1 = new Passport("Saurabh", "Bangalore", "India");
        Passport p2 = new Passport("Gaurav", "California", "USA");
        Passport p3 = new Passport("Priya", "Mumbai", "India");
        Passport p4 = new Passport("Rahul", "London", "UK");
        Passport p5 = new Passport("Ananya", "Paris", "France");

        Integer id1 = Integer.valueOf(101);
        Integer id2 = Integer.valueOf(102);
        Integer id3 = Integer.valueOf(103);
        Integer id4 = Integer.valueOf(104);
        Integer id5 = Integer.valueOf(105);

        HashMap<Integer,Passport> hm = new HashMap<>();
        hm.put(id1, p1);
        hm.put(id2, p2);
        hm.put(id3, p3);
        hm.put(id4, p4);
        hm.put(id5, p5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the passport id to fetch the the details");
        int id = sc.nextInt();

        Set<Integer> keys = hm.keySet();
        Iterator<Integer> itr=keys.iterator();
        boolean found = false;

        while (itr.hasNext()) {
            if (id == itr.next()) {
                Passport p = hm.get(id);
                System.out.printf("Name = %s, City = %s, Country = %s%n", p.name, p.city, p.country);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No passport available of this id");
        }
        
    }
}