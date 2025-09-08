import java.sql.*;
import java.util.Scanner;

public class SimpleInsertSelect {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/testdb";
        String user="root";
        String password ="3809";

        try{
            Connection conn=DriverManager.getConnection(url,user,password);
            Scanner sc=new Scanner(System.in);

            System.out.print("enter name to insert:");
            String name = sc.nextLine();
            String insertQuery="INSERT INTO test (name) values (?)";
            PreparedStatement pstmt=conn.prepareStatement(insertQuery);
            pstmt.setString(1,name);
            pstmt.executeUpdate();
            System.out.println("success");

            String selectQuery="SELECT * FROM TEST";
            Statement stmt=conn.createStatement();
            ResultSet rs =stmt.executeQuery(selectQuery);
             System.out.println("\n--- Student List ---");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
            }
            conn.close();
            sc.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
