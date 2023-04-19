package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DomainModel.Booking;

public class BookingDAO {
	public void insert(Booking booking) throws SQLException {
		Connection con = DB.DBFactory.getConnection();
		PreparedStatement statement = con.prepareStatement("insert into tbbooking (ArrivalDate, DepartureDate, BookingValue, NroBooking, Id_PayMethod)values"
				+ "(?, ?, ?,?, ?)");
		
		statement.setDate(1, java.sql.Date.valueOf(booking.getArrivalDate()));
		statement.setDate(2, java.sql.Date.valueOf(booking.getDepartureDate()));
		statement.setBigDecimal(3, booking.getPrice());
		statement.setInt(4, booking.getNroBooking());
		statement.setInt(5, booking.getPayMethod().getId());
		statement.execute();
	}

	public List<Booking> listing() throws SQLException{
		List<Booking>list = new ArrayList();
		Connection con = DB.DBFactory.getConnection();
		PreparedStatement statement = con.prepareStatement(
		"select B.Id as Booking_id, ArrivalDate, DepartureDate, BookingValue, NroBooking, P.MethodName as MethodName, P.Id as Pid from tbBooking B, tbPayMethod P where P.Id = B.Id_PayMethod;"
		);	
		statement.execute();
		ResultSet resultset = statement.getResultSet();
		while(resultset.next()) {
			Booking booking = new Booking();
			booking.setArrivalDate(resultset.getDate("ArrivalDate").toLocalDate());
			booking.setDepartureDate(resultset.getDate("DepartureDate").toLocalDate());
			booking.setId(resultset.getInt("Booking_Id"));
			booking.setNroBooking(resultset.getInt("NroBooking"));
			booking.setPayMethodId(resultset.getInt("Pid"));
			booking.setPayMethodName(resultset.getString("MethodName"));
			booking.setPrice(resultset.getBigDecimal("BookingValue"));
			list.add(booking);
		}
		return list;
	}
}
 