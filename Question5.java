import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
public class Question5{
  private static String driver = "org.apache.hive.jdbc.HiveDriver";
  public static void main(String[] args) throws SQLException {
    try {
      Class.forName(driver);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      System.exit(1);
    }
    Connection connect = DriverManager.getConnection("jdbc:hive2://localhost:10000/w14sh2", "", "");
    Statement state = connect.createStatement();
    state.executeQuery("create table olympic(AthletName String, Country String, Closing_Date String, Sport String, Age Int, Year Int, Gold_medals INT, Silver_medals Int, Bronze_medals Int, Total_medals Int)row format delimited fields terminated by ',' lines terminated by '\n';");
   }
}