import java.util.Scanner;

public class cgpa{
    public static void main(String[] args){
        System.out.print("Java=");
        Scanner sc=new Scanner(System.in);
        int java=(sc.nextInt())/10+1;
        System.out.print("OS=");
        int os=sc.nextInt()/10+1;
        System.out.print("Maths=");
        int math=sc.nextInt()/10+1;
        System.out.print("SQL=");
        int sql=sc.nextInt()/10+1;
        System.out.print("Python=");
        int python=sc.nextInt()/10+1;
        System.out.println("CGPA="+(java+os+math+sql+python)/5f);
    }
}
