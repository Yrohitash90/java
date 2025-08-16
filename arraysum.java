import java.util.Scanner;
public class arraysum{
    public static void main(String[] argss){
        Scanner sc=new Scanner(System.in);
        float[] arr=new float[5];
        int i;
        for(i=0;i<5;i++){
            System.out.print("enter float value= ");
            arr[i]=sc.nextFloat();
        }
        float sum=0;
        for(i=0;i<5;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum Of Floats ="+sum);
    }
}
