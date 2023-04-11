package DomainModel;

import java.util.Date;

public class Guest {
	private int Id;
	private String Name;
	private String Last_Name;
	private Nationality Nationality;
	private Date Born_Date;
	private String PhNumber;
	private Booking booking;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public Nationality getNationality() {
		return Nationality;
	}
	public void setNationality(Nationality nationality) {
		Nationality = nationality;
	}
	public Date getBorn_Date() {
		return Born_Date;
	}
	public void setBorn_Date(Date born_Date) {
		Born_Date = born_Date;
	}
	public String getPhNumber() {
		return PhNumber;
	}
	public void setPhNumber(String phNumber) {
		PhNumber = phNumber;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	
}
