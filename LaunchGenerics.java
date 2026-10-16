import java.util.ArrayList;

class Employee{
    private Integer id;
    private String name;
    private String roll;

    public Employee(Integer id,String name,String roll){
        super();
        this.id = id;
        this.name = name;
        this.roll = roll;
    }

    public String toString(){
        return  "[id = "+id+" Name = "+name+" Roll = "+roll+"]";
    }

}

public class LaunchGenerics {
    public static void main(String[] args) {
        
        ArrayList<Employee> emp= new ArrayList<>();
        emp.add(new Employee(12, "saurabh", "15B"));
        emp.add(new Employee(13, "Mayur", "12B"));
        emp.add(new Employee(14, "Rohit", "14c"));

        for(Employee e:emp){
            System.out.println(e);
        }
    }
}
