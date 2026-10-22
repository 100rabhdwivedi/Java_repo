enum Week{
    MON,TUE,WED,THU,FRI,SAT,SUN;
}
public class LaunchEnum {
    public static void  main(String args[]){
        Week w = Week.SAT;
        System.out.println(w);
        int idx = w.ordinal();
        System.out.println(idx);
        System.out.println(Week.WED.ordinal());

        Week [] wAr= Week.values();
        for(Week d:wAr){
            System.out.println(d);
        }
    }
}
