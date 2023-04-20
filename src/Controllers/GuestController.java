package Controllers;

import java.sql.SQLException;
import java.util.List;

import DAO.GuestDAO;
import DomainModel.Guest;

public class GuestController {
	GuestDAO guestDao = new GuestDAO();
	public void Insert(Guest guest) throws SQLException {
		guestDao.insert(guest);
	}

	public List<Guest> Listing() throws SQLException {
		return guestDao.listing();
	}
	public void Delete(int Id) throws SQLException {
		guestDao.delete(Id);
	}
}
