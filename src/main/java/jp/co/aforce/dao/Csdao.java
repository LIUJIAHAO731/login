package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.beans.Bean;

public class Csdao extends DAO {
	public Bean search(String login,String pass)
	throws Exception{
		Bean bean=null;
		
		Connection ds=getConnection();
		
		PreparedStatement st;
		st=ds.prepareStatement(
				"select*from login where login=? and pass=?");
		st.setString(1, login);
		st.setString(2,pass);
		
		ResultSet rs=st.executeQuery();
		
		while(rs.next()) {
			bean=new Bean();
			bean.setId(rs.getInt("id"));
			bean.setName(rs.getString("login"));
			bean.setPass(rs.getString("pass"));
		}
		st.close();
		ds.close();
		return bean;
	}

}
