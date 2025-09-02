import java.util.Scanner;
public class replace {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter line =");
        String org_name=sc.nextLine();
        String new_name=org_name.replace(" ","_");
        System.out.println(new_name);
    }
}
