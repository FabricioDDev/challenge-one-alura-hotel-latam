package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DomainModel.Booking;
import DomainModel.Guest;

public class GuestDAO {
	public void insert(Guest guest) throws SQLException {
		Connection con = DB.DBFactory.getConnection();
		PreparedStatement statement = con.prepareStatement("insert into tbGuest (Name, Last_Name, BornDate, Id_Nationality, Tlfn, NroBooking)values"
				+ "(?, ?, ?, ?, ?, ?)");
		statement.setString(1, guest.getName());
		statement.setString(2, guest.getLast_Name());
		statement.setDate(3, java.sql.Date.valueOf(guest.getBorn_Date()));
		statement.setInt(4, guest.getNationality().getId());
		statement.setString(5, guest.getPhNumber());
		statement.setInt(6, guest.getBookingNumber());
		
		statement.execute();
	}

	public List<Guest> listing() throws SQLException {
		List<Guest>list = new ArrayList();
		Connection con = DB.DBFactory.getConnection();
		PreparedStatement statement = con.prepareStatement(
		"select G.Id as Guest_Id,Name, Last_Name, BornDate, Tlfn, NroBooking, N.Id as Nid, Nation from tbGuest G, tbNationality N where N.Id = Id_Nationality;"
		);	
		statement.execute();
		ResultSet resultset = statement.getResultSet();
		while(resultset.next()) {
			Guest guest = new Guest();
			guest.setId(resultset.getInt("Guest_Id"));
			guest.setBookingNumber(resultset.getInt("NroBooking"));
			guest.setBorn_Date(resultset.getDate("BornDate").toLocalDate());
			guest.setLast_Name(resultset.getString("Last_Name"));
			guest.setName(resultset.getString("Name"));
			guest.getNationality().setId(resultset.getInt("Nid"));
			guest.getNationality().setName(resultset.getString("Nation"));
			guest.setPhNumber(resultset.getString("Tlfn"));
			list.add(guest);
		}
		return list;
		
	}
}
