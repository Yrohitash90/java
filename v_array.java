import java.util.Scanner;

public class v_array{
    int[] sum(int...arr){
        int n= arr.length;
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
        }
        int multi=1;
        for (int i=0;i<n;i++){
            multi*=arr[i];
        }
        int[] re_arr={sum,multi};
        return re_arr;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter range=");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        v_array obj=new v_array();
        int[] re_arr=obj.sum(arr);
        System.out.println("Sum of Array="+re_arr[0]);
        System.out.println("multiply of Array="+re_arr[1]);
    }
}