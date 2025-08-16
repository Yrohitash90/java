import java.util.Scanner;

public class pat1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("N=");
        int n=sc.nextInt();
        sc.close();
        int i,j;
        for (i=n;i>0;i--){
            for(j=i;j>0;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
        
    }
}
