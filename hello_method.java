<<<<<<< HEAD
import java.util.Scanner;

public class hello_method{

    void hello_print(int n){
        for(int i=0;i<n;i++){
            System.out.println("Namaste India");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("how many time u want to print namaste=");
        int n=sc.nextInt();
        hello_method obj=new hello_method();
        obj.hello_print(n);
    }
=======
import java.util.Scanner;

public class hello_method{

    void hello_print(int n){
        for(int i=0;i<n;i++){
            System.out.println("Namaste India");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("how many time u want to print namaste=");
        int n=sc.nextInt();
        hello_method obj=new hello_method();
        obj.hello_print(n);
    }
>>>>>>> d060edb (commit)
}