package DomainModel;

import java.math.BigDecimal;
import java.util.Date;

public class Booking {
	private int Id;
	private Date ArrivalDate;
	private Date DepartureDate;
	private PayMethod PayMethod;
	private BigDecimal Price;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Date getArrivalDate() {
		return ArrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		ArrivalDate = arrivalDate;
	}
	public Date getDepartureDate() {
		return DepartureDate;
	}
	public void setDepartureDate(Date departureDate) {
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
