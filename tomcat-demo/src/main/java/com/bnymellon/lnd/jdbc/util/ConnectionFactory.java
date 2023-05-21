package com.bnymellon.lnd.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	// Static reference to itself
	private static ConnectionFactory instance = new ConnectionFactory();

	public static final String DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	public static final String USER = "sys as sysdba";
	public static final String PASSWORD = "oraclexe";
	
	/*public static final String DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@10.232.71.29:1521:INATP0";
	public static final String USER = "shobana";
	public static final String PASSWORD = "shobana";
	*/
	// private constructor
	private ConnectionFactory() {
		try {
			Class.forName(DRIVER_CLASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private Connection createConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			System.out.println("ERROR: Unable to Connect to Database.");
		}
		return connection;
	}

	public static Connection getConnection() {
		return instance.createConnection();
	}
}
