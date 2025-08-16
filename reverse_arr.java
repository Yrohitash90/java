import  java.util.Scanner;
public class reverse_arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array=");
        int n=sc.nextInt();
        int arr[]=new int[10]; 
        int i;
        System.out.println("enter elements");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("original array=");
        for (i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        i=0;
        int j=n-1;
        int temp;
        do{
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
            i++;
        }while(i<j);
        System.out.println();
         System.out.print("Reversed array=");
        for (i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
