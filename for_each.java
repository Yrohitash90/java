import java.util.Scanner;
public class for_each{
    public static void main(String[] argss){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        int i;
        for(i=0;i<5;i++){
            System.out.print("value= ");
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int j:arr){
            sum=sum+j;
        }
        System.out.println("Avarage Marks="+sum/5);
    }
}
