package DomainModel;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

public class Booking {
	private int Id;
	private LocalDate ArrivalDate;
	private LocalDate DepartureDate;
	private PayMethod PayMethod;
	private BigDecimal Price = new BigDecimal(150.70);
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
	public void setPayMethod(PayMethod payMethod) {
		PayMethod = payMethod;
	}
	public BigDecimal getPrice() {
		return Price;
	}
	public void setPrice(BigDecimal price) {
		Price = price;
	}
}
