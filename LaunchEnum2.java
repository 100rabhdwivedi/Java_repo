enum Result{
    PASS,FAIL;

    // enum Week{
    //     MON,TUE;
    // }
    int marks;
    Result(){
        System.out.println("Inside enum constructor:");
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
    public void getMarks(){
        System.out.println(marks);
    }
}
public class LaunchEnum2 {
    public static void main(String[] args) {
        Result rs = Result.PASS;
        rs.setMarks(55);
        rs.getMarks();

        Result.PASS.setMarks(96);
        Result.PASS.getMarks();

        Result.FAIL.getMarks();
    }
}
