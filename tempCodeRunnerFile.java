import java.util.Scanner;
public class lowe {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first name =");
        String org_name=sc.next();
        String new_name=org_name.toLowerCase();
        System.out.println("Lower_case ="+new_name);
    }
}