package Controllers;
import java.sql.SQLException;

import DAO.BookingDAO;
import DomainModel.Booking;
public class BookingController {
	public void insert(Booking booking) throws SQLException {
		BookingDAO bdao = new BookingDAO();
		bdao.insert(booking);
	}
}
