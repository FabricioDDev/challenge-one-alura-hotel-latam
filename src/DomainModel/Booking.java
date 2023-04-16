package DomainModel;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

public class Booking {
	public int getNroBooking() {
		return NroBooking;
	}
	public void setNroBooking(int nroBooking) {
		NroBooking = nroBooking;
	}
	private int Id;
	private LocalDate ArrivalDate;
	private LocalDate DepartureDate;
	private PayMethod PayMethod = new PayMethod();
	private BigDecimal Price = new BigDecimal(150.70);
	private int NroBooking;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public LocalDate getArrivalDate() {
		return ArrivalDate;
	}
	public void setArrivalDate(LocalDate arrivalDate) {
		ArrivalDate = arrivalDate;
	}
	public LocalDate getDepartureDate() {
		return DepartureDate;
	}
	public void setDepartureDate(LocalDate departureDate) {
		DepartureDate = departureDate;
	}
	public PayMethod getPayMethod() {
		return PayMethod;
	}
	public void setPayMethodName(String name) {
		PayMethod.setMethodName(name);
	}
	public void setPayMethodId(int Id) {
		PayMethod.setId(Id);
	}
	public BigDecimal getPrice() {
		return Price;
	}
	public void setPrice(BigDecimal price) {
		Price = price;
	}
}
