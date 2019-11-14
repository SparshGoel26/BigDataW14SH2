import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
public class Question10{
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
    state.executeQuery("select add(count(Gold_medals),count(Silver_medals),count(Bronze_medals)) from Olympics Where County="India" Group by Year;");
  }
}