import java.util.Scanner;
public class percent{
    public static void main(String[] atrgs){
        System.out.print("Math =");
        Scanner sc=new Scanner(System.in);
        int math=sc.nextInt();
        System.out.print("English =");
        int eng=sc.nextInt();
        System.out.print("Java =");
        int Java=sc.nextInt();
        System.out.print("Total Percentage= ");
        System.out.println((math+eng+Java)/3F+"%");
    }
}
