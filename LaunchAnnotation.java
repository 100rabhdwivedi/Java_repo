import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention (RetentionPolicy.RUNTIME)
@Target ({ElementType.METHOD,ElementType.TYPE})
@interface CricketPlayer{
    String country() default "India";
    int age() default 38;
}

@CricketPlayer(country="India")
class ViratKohli{
    private int innings;

    ViratKohli(){
        innings = 300;
    }
    
    @CricketPlayer ()
    public void setInnings(int inn){
        innings = inn;
    }

    @CricketPlayer ()
    public void getInnings(){
        System.out.println(innings);
    }
}

public class LaunchAnnotation {
    public static void main(String[] args) {
        ViratKohli vk = new ViratKohli();
        vk.setInnings(400);
        vk.getInnings();
        Class <? extends ViratKohli> c=vk.getClass();
        CricketPlayer cp = c.getAnnotation(CricketPlayer.class);

        int age = cp.age();
        String country = cp.country();

        System.out.print(age);
        System.out.println(country);

    }
}
