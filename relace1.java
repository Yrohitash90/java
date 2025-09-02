import java.util.Scanner;
public class relace1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter name =");
        String name=sc.nextLine();
        String letter="Dear <|name|>, Thanks a lot";
        String new_letter=letter.replace("<|name|>",name);
        System.out.println(new_letter);
    }
}

