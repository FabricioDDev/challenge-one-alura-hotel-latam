package Controllers;
import java.sql.SQLException;
import java.util.List;

import DAO.BookingDAO;
import DomainModel.Booking;
public class BookingController {
	BookingDAO bdao = new BookingDAO();
	public void insert(Booking booking) throws SQLException {
		
		bdao.insert(booking);
	}
	public List<Booking>Listing() throws SQLException{
		return  bdao.listing();
	}
	public void Delete(int Id) throws SQLException {
		bdao.delete(Id);
	}
	public void update(Booking booking) throws SQLException {
		bdao.update(booking);
	}
}
