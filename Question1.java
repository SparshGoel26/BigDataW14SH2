package w14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Question1 {

	private static String driverName = "org.apache.hive.jdbc.HiveDriver";

	public static void main(String[] args) throws SQLException,
			ClassNotFoundException {
		Class.forName(driverName);

		Connection con = DriverManager.getConnection(
				"jdbc:hive2://localhost:10000/w14sh2", "", "");
		Statement stmt = con.createStatement();
		stmt.execute("create table emp(emp_id int, birthday string, first_name string, last_name string, gender varchar(5), work_day string) row format delimited fields terminated by ',' lines terminated by '\n' ");
		System.out.println("Table created successfully.");

		stmt.execute("create table sal(emp_id int, salary string, start_date string, end_date string) row format delimited fields terminated by ',' lines terminated by '\n' ");
		System.out.println("Table created successfully.");

		con.close();
	}
}