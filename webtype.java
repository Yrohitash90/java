import java.util.Scanner;

public class webtype{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter URL=");
        String url=sc.next();
        if (url.endsWith("in")){
            System.out.print("Indian Website");
        }
        else{
            if (url.endsWith("org")){
                System.out.print("Organizational Website");
            }
            else{
                if(url.endsWith("com")){
                    System.out.print("Commercial Website");
                }
                else{
                    System.out.print("Unknown Website");
                }
            }
        }
    }
}
