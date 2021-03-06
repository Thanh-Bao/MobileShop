package model_ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.management.Query;

import model_utility.Config;

public class ConnectionPoolManager {

	// danh sách các single connection ĐANG TRỐNG trong một connection Pool
	private Queue<Connection> availableConnections = new LinkedList<Connection>();

	public ConnectionPoolManager() {
		while (!isMaxPool()) {
			availableConnections.add(createNewSingleConnectionToDB());
		}
	}

	private synchronized boolean isMaxPool() {
		final int MAX_POOL_SIZE = Config.DB_MAX_CONNECTIONS;
		if (availableConnections.size() < MAX_POOL_SIZE) {
			return false;
		}
		return true;
	}

	// Tạo mới 1 single connection
	private Connection createNewSingleConnectionToDB() {
		String URL = Config.SERVER_NAME + ";databaseName=" + Config.DATABASE_NAME;
		Connection connection = null;
		try {
			Class.forName(Config.DBDRIVER);
			connection = DriverManager.getConnection(URL, Config.USERNAME_DB, Config.PASSWORD_DB);
			return connection;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	// Thực hiện câu truy vấn SQL bằng connection này ( lấy ra từ list connection )
	public synchronized Connection getSingleConnectionFromPool() {
		Connection connection = null;
		if (availableConnections.size() > 0) {
			connection = availableConnections.remove();		
		}
		return connection;
	}

	// Hoàn trả single Connection về Pool sau khi sử dụng xong ( list avail tăng lên
	// 1 ).
	public synchronized void returnConnectionToPool(Connection connection) {
		if (connection != null) {
			availableConnections.add(connection);
		}
	}
	
	


}