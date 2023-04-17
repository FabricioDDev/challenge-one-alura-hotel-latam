package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
