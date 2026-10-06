import java.util.Scanner;

public class LaunchArray1 {
    public static void main(String[] args) {
        // int [] arr = new int[3];
        // Scanner scan = new Scanner(System.in);

        // for(int i=0;i<arr.length;i++){
        //     System.out.print("Enter the value of index "+i+" = ");
        //     arr[i]=scan.nextInt();
        // }

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]);
        // }

        // int [][] arr2 = new int[3][4];
        // Scanner scan = new Scanner(System.in);



        // for (int i=0;i<arr2.length;i++){
        //     for(int j=0;j<arr2[i].length;j++){
        //         System.out.printf("Enter the value of %d class %d student marks = ",i,j);
        //         arr2[i][j]=scan.nextInt();
        //     }
        // }

        // for (int i=0;i<arr2.length;i++){
        //     for(int j=0;j<arr2[i].length;j++){
        //         System.out.print(arr2[i][j]+"  ");
        //     }
        //     System.out.println();
        // }





        // Scanner scan = new Scanner(System.in);
        // int [][] marks = new int[2][];
        // marks[0] = new int[2];
        // marks[1] = new int[3];

        // for (int i=0;i<marks.length;i++){
        //     for(int j=0;j<marks[i].length;j++){
        //         System.out.printf("Enter the value of %d row's %d column = ",i,j);
        //         marks[i][j] = scan.nextInt();
        //     }
        // }


        // for (int i=0;i<marks.length;i++){
        //     for(int j=0;j<marks[i].length;j++){
        //         System.out.print(marks[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // for(int elem[]:marks){
        //     for(int val:elem){
        //         System.out.print(val+" ");
        //     }
        //     System.out.println();
        // }
        // scan.close();



        
        Scanner sc = new Scanner(System.in);

        int[][][] arr = new int[2][][];

        arr[0] = new int[2][];
        arr[1] = new int[1][];

        arr[0][0] = new int[3];
        arr[0][1] = new int[2];
        arr[1][0] = new int[4];

        // Taking values from user
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {

                    System.out.print("Enter value for arr[" + i + "][" + j + "][" + k + "]: ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        // Displaying values
        System.out.println("\nArray values:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {

                    System.out.println(
                        "arr[" + i + "][" + j + "][" + k + "] = "
                        + arr[i][j][k]
                    );
                }
            }
        }

        sc.close();
        


    }
}
