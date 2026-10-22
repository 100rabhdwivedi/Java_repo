import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer{
    int age;
    String name;
    double avg;

    public Cricketer(int age,String name,double avg){
        this.name = name;
        this.age = age;
        this.avg = avg;
    }
    public String toString(){
        return "[ name = "+name+" Age = "+age+" Avg = "+avg+" ]";
    }
}

// class Xyz implements  Comparator<Cricketer>{
//     public int compare(Cricketer o1,Cricketer o2){
//         if(o1.avg >o2.avg){
//             return 1;
//         }else{
//             return -1;
//         }
//     }
// }
public class LaunchComprator {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer(30, "saurabh", 88.2);
        Cricketer c2 = new Cricketer(20, "virat", 68.2);
        Cricketer c3 = new Cricketer(30, "raju", 55.2);

        ArrayList<Cricketer> list = new ArrayList<>();
        list.add(c3);
        list.add(c1);
        list.add(c2);

        // Xyz x1 = new Xyz();
        // System.out.println(list);
        // Collections.sort(list,x1);
        // System.out.println(list);

        // Comparator<Cricketer> c = new Comparator<Cricketer>() {
        //     public int  compare(Cricketer o1,Cricketer o2){
        //         if (o1.avg>o2.avg)
        //             return 1;
        //         else
        //             return -1;
        //     }
        // };

            //     Comparator<Cricketer> c = (Cricketer o1,Cricketer o2)-> {
            
            //     if (o1.avg>o2.avg)
            //         return 1;
            //     else
            //         return -1;
            // };
    

        System.out.println(list);
        Collections.sort(list,c);
        System.out.println(list);
    }
}
