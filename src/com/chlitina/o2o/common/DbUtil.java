package com.chlitina.o2o.common;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DbUtil {
	static {

	}

	// ��ȡ��ݿ����Ӷ���
	public static Connection getConn() {
		Connection conn = null;
		Properties properties = loadProperties();
		String dbstr = properties.getProperty("dbstr");
		String dbuser = properties.getProperty("dbuser");
		String dbpw = properties.getProperty("dbpw");

		try {
			// "jdbc:oracle:thin:@localhost:1521:�����ݿ�����", "�û���","����"
			conn = DriverManager.getConnection("jdbc:oracle:thin:@" + dbstr,
					dbuser, dbpw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	/*
	 * //��ȡ���ִ�ж��� public static Statement getStatement(Connection conn) {
	 * Statement stmt = null; try { stmt = conn.createStatement(); } catch
	 * (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } return stmt; }
	 */
	// ��ȡԤ�������ִ�ж���
	public PreparedStatement getPreparedStatement(Connection conn, String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pstmt;
	}

	// ��ȡ������
	public ResultSet getResultSet(Connection conn, String strSQL) {

		// Connection conn = DbUtil.getConn();
		PreparedStatement pstmt = this.getPreparedStatement(conn, strSQL);
		ResultSet res = null;
		try {
			res = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// �Ͽ�����
			// DbUtil.close(conn, pstmt);
		}
		return res;
	}

	// ��ȡ������
	/*
	 * public static ResultSet getResultSet(Statement stmt, String sql) {
	 * ResultSet res = null; try { res = stmt.executeQuery(sql); } catch
	 * (SQLException e) { e.printStackTrace(); } return res; }
	 */
	// �ر���Դ����
	public void close(Connection conn, Statement stmt) {
		// close(res);
		close(stmt);
		close(conn);
	}

	// ��װ�����ر�������
	public void close(Statement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			stmt = null;
		}
	}

	// ��װ�����رս�����
	public void close(ResultSet res) {
		if (res != null) {
			try {
				res.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			res = null;
		}
	}

	// ��װ�����ر���ݿ����Ӷ���
	public void close(Connection conn) {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conn = null;
	}

	public boolean UpOpera(Connection conn, String strSQL) throws SQLException {
		// ����Ӱ�������
		int row = 0;
		// ������ݿ�����
		// Connection conn = DbUtil.getConn();
		// ��PreparedStatement���ִ�ж���ִ��sql���
		PreparedStatement pstmt = this.getPreparedStatement(conn, strSQL);
		try {
			// ִ��
			row = pstmt.executeUpdate();
			// conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
			throw e;
			// conn.rollback();
		} /*
		 * finally { // �Ͽ����� this.close(conn, pstmt); }
		 */
		// ���ؽ��
		pstmt.close();
		System.out.println("Ӱ�쵽" + row + "�У�");
		return (row > 0 ? true : false);
	}

	public static Properties loadProperties() {
		DbUtil du = new DbUtil();
		Properties prop = new Properties();
		try {
			prop.load(du.getClass().getResourceAsStream("/database.properties"));
		} catch (IOException e) {
		}
		return prop;
	}

	public static Properties loadSapProperties() {
		DbUtil du = new DbUtil();
		Properties prop = new Properties();
		try {
			prop.load(du.getClass().getResourceAsStream("/sap_conf.properties"));
		} catch (IOException e) {
		}
		return prop;
	}

}
