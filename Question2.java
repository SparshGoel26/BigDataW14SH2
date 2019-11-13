package w14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Question2 {
	private static String driverName = "org.apache.hive.jdbc.HiveDriver";

	public static void main(String[] args) throws SQLException,
			ClassNotFoundException {
		Class.forName(driverName);

		Connection con = DriverManager.getConnection(
				"jdbc:hive2://localhost:10000/w14sh2", "", "");
		Statement stmt = con.createStatement();
		stmt.execute("load data local inpath '/home/cloudera/W14SH2/Q1-4/employee.csv' into table employee");
		System.out.println("Data loaded successfully.");

		stmt.execute("load data local inpath '/home/cloudera/W14SH2/Q1-4/salary.csv' into table salary");
		System.out.println("Data loaded successfully.");

		con.close();
	}
}
