import java.util.Scanner;
public class ispresent{
    public static void main(String[] argss){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        int i;
        for(i=0;i<5;i++){
            System.out.print("value= ");
            arr[i]=sc.nextInt();
        }
        System.out.print("enter seasrch no=");
        int search=sc.nextInt();
        boolean ispresent=false;
        for (i=0;i<5;i++){
            if(arr[i]==search){
                ispresent=true;
                break;
            }
        }
        if(ispresent){
            System.out.println(search+"is present in array");
        }
        else{
            System.out.println(search+"is not present in array");
        }
    }
}
