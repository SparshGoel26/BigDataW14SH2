import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
public class Question4{
  private static String driver = "org.apache.hive.jdbc.HiveDriver";  //driver used for hiveserver2
  public static void main(String[] args) throws SQLException {
    try {
      Class.forName(driver);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      System.exit(1);
    }
    Connection connect = DriverManager.getConnection("jdbc:hive2://localhost:10000/w14sh2", "", "");   //connecting to default database
    Statement state = connect.createStatement();
    state.executeQuery("select Emp_id from Salary order by avg(salary) desc limit 10;");
  }
}