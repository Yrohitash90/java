import java.util.Scanner;

public class failorpass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Math=");
        int x=sc.nextInt();
        System.out.print("English=");
        int y=sc.nextInt();
        System.out.print("Science=");
        int z=sc.nextInt();
        int total=(x+y+z)/3;
        if (x>=33 && y>=33 && z>=33 && total>=40){
            System.out.println("Result= PASS");
        }
        else{
            System.out.println("Result= FAIL");
        }
    }
}