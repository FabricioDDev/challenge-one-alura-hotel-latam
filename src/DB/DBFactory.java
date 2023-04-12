package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBFactory {
	public static Connection getConnection() throws SQLException  {
			return DriverManager.getConnection(
					"jdbc:mysql://localhost/AluraHotel_DB?useTimeZone=true&&serverTimeZone=UTC",
					"root", "NOsequeponer10"
					);
	}
}
