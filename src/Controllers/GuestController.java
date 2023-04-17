package Controllers;

import java.sql.SQLException;

import DAO.GuestDAO;
import DomainModel.Guest;

public class GuestController {
	public void Insert(Guest guest) throws SQLException {
		GuestDAO guestDao = new GuestDAO();
		guestDao.insert(guest);
	}
}
