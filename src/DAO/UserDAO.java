package DAO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import DB.DBFactory;

public class UserDAO {

	public Boolean existUser(String UserName, String Password) throws SQLException{
		Connection con = DBFactory.getConnection();
		Statement statement = con.createStatement();
		statement.execute("SELECT Id from tbUser where UserName='"+UserName+"' and Password='"+Password+"'");
		
		ResultSet resultset = statement.getResultSet();
		while(resultset.next()) {
			if(resultset.getInt("Id")>0) {
				return true;
			}
		}
		return false;
	}
}		
