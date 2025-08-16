import java.util.Scanner;
public class sumfirstneven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("N=");
        int n=sc.nextInt();
        int i=0;
        int j=0;
        int sum=0;
        while(i<=n){
            sum=sum+j;
            j=j+2;
            i++;
        }
        System.out.println("SUM="+sum);
    }
}
