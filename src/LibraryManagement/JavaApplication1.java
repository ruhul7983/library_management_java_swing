/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LibraryManagement;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaApplication1 {

    void connection() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management", "root", "RuhuLAmiN4$");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from students");
            int count = 0;
            while (resultSet.next()) {
                System.out.println(count);
                System.out.println(resultSet.getString("StudentId"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("department"));
                System.out.println("password");
                count++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        JavaApplication1 j = new JavaApplication1();
        j.connection();
        FirstPage.main(args);
    }
    
}
