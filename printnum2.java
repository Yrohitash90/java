import java.util.Scanner;
public class printnum2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter range=");
        int n=sc.nextInt();
        int i=1;
        int j=0;
        sc.close();
        do { 
            do{
                System.out.print(" "+i+" ");
                j++;
            }while(j<i);
            i++;
            j=0;
            System.out.println();
        } while (i<=n);
    }
}
