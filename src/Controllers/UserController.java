package Controllers;
import java.sql.SQLException;

import DAO.UserDAO;
public class UserController {
	public Boolean login(String UserName, String Password) throws SQLException {
		UserDAO userDao = new UserDAO();
		return userDao.existUser(UserName, Password);
	}
}
