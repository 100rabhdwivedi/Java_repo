class Gamma{
    public int dis(){
        try{
            System.out.println("Gamma method:");
            return  10;
        }finally{
            System.out.println("finally of gamma");
            return 45;
        }
    }
}
public class LaunchEH4 {
    public static void main(String[] args) {
        Gamma g = new Gamma();
        System.out.println(g.dis());
    }
}
