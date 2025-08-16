import java.util.Scanner;
public class tax{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter income=");
        double income=sc.nextDouble();
        sc.close();
        double tax;
        if (income>=250000 && income<=499999){
            tax=(income*5)/100;
        }
        else{
            if (income>=500000 && income<=999999){
                tax=(income*20)/100;
            }
            else{
                if (income>=1000000){
                    tax=(income*30)/100;
                }
                else{
                    tax=0;
                }
            }
        }
        if (tax==0){
            System.out.print("No TAX (BELOW INCOME 2.5LACs)");
        }
        else{
            System.out.print("TAX= "+tax);
        }
    }
}
