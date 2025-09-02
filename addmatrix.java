import java.util.Scanner;
public class addmatrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[2][3];
        int b[][] =new int[2][3];
        int i,j;
        System.out.println("enter elements of matrix A");
        for (i=0;i<2;i++){
            for (j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter elements of matrix B");
        for (i=0;i<2;i++){
            for(j=0;j<3;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("ADDITION OF A AND B");
        for (i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.print(a[i][j]+b[i][j]+" ");
            } 
            System.out.println();
        }
    }
}