/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datacollection.reporting;

/**
 *
 * @author Student
 */
import javax.swing.JOptionPane;
public class DBCon {
   public static String conString = "jdbc:mysql://localhost:3306/faculty";
    public static String userName = "root";
    public static String pass = "Srm@123456";
    
    static
    {
        try
        {
                        // Database driver loading
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception ex)
        {
            
        }
    } 
}
