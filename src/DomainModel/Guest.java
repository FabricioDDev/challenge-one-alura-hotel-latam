package DomainModel;

import java.time.LocalDate;
import java.util.Date;

public class Guest {
	public Guest() {
		Nationality = new Nationality();
	}
	private int Id;
	private String Name;
	private String Last_Name;
	private Nationality Nationality;
	private LocalDate Born_Date;
	private String PhNumber;
	private int bookingNumber;
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
	public LocalDate getBorn_Date() {
		return Born_Date;
	}
	public void setBorn_Date(LocalDate born_Date) {
		Born_Date = born_Date;
	}
	public String getPhNumber() {
		return PhNumber;
	}
	public void setPhNumber(String phNumber) {
		PhNumber = phNumber;
	}
	public int getBookingNumber() {
		return bookingNumber;
	}
	public void setBookingNumber(int booking) {
		this.bookingNumber = booking;
	}
	
}
