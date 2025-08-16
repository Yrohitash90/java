import java.util.Scanner; 
public class add3num { 
    public static void main(String[] args) { 
        System.out.println("enter three numbers= ");
        Scanner sc = new Scanner(System.in); 
        int x = sc.nextInt(); 
        int y = sc.nextInt(); 
        int z = sc.nextInt(); 
        System.out.println(x + y + z); 
    } 
}