package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManagerUtil {
	private static final String URL_KEY="db.url";
	private static final String LOGIN_KEY="db.login";
	private static final String PASSWORD_KEY="db.password";

	public static Connection openConnectionWithDB() {
		try {
			return  DriverManager.getConnection(PropertiesUtil.get(URL_KEY), PropertiesUtil.get(LOGIN_KEY), PropertiesUtil.get(PASSWORD_KEY));

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
