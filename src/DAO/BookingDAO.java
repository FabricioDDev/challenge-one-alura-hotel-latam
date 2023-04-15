package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DomainModel.Booking;

public class BookingDAO {
	public void insert(Booking booking) throws SQLException {
		Connection con = DB.DBFactory.getConnection();
		PreparedStatement statement = con.prepareStatement("insert into tbbooking (ArrivalDate, DepartureDate, BookingValue, Id_PayMethod)values"
				+ "(?, ?, ?, ?)");
		
		statement.setDate(1, java.sql.Date.valueOf(booking.getArrivalDate()));
		statement.setDate(2, java.sql.Date.valueOf(booking.getDepartureDate()));
		statement.setBigDecimal(3, booking.getPrice());
		statement.setInt(4, 1);
		statement.execute();
	}
}
 