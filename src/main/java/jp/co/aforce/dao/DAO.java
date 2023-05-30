package jp.co.aforce.dao;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DAO {
	static DataSource ct;
	
	
	public Connection getConnection()throws Exception{
		if(ct==null) {
			InitialContext ic=new InitialContext();
			ct=(DataSource)ic.lookup("java:/comp/env/jdbc/login_db");
		}
		return ct.getConnection();
	}
}
