package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import DomainModel.Nationality;

public class NationalityDAO {
	public List<Nationality>Listing() throws SQLException{
		List<Nationality>nationality = new LinkedList<>();
		Connection con = DB.DBFactory.getConnection();
		PreparedStatement statement = con.prepareStatement("select Id, Nation from Nationality;");
		ResultSet resultset = statement.getResultSet();
		while(resultset.next()) {
			Nationality nation = new Nationality();
			nation.setId(resultset.getInt("Id"));
			nation.setName(resultset.getString("Name"));
			nationality.add(nation);
		}
		return nationality;
	}
}
