/**
 * 
 */
package com.einfochips.activity.model;

import java.util.Date;

/**
 * @author 158417
 *
 */
public class Ticket {

	private String ticketID;
	private long mobileNo;
	private String movieName;
	private Date bookingDate;
	private Date showDate;
	private Date showTime;
	private String seatType;
	private String typeOfSeat;
	private String paymentType;
	private String transactionId;
	private String status;
	private double amount;

	/**
	 * 
	 */
	public Ticket() {
		super();
	}

	/**
	 * @param ticketID
	 * @param mobileNo
	 * @param movieName
	 * @param bookingDate
	 * @param showDate
	 * @param showTime
	 * @param seatType
	 * @param typeOfSeat
	 * @param paymentType
	 * @param transactionId
	 * @param status
	 * @param amount
	 */
	public Ticket(String ticketID, long mobileNo, String movieName, Date bookingDate, Date showDate, Date showTime,
			String seatType, String typeOfSeat, String paymentType, String transactionId, String status,
			double amount) {
		super();
		this.ticketID = ticketID;
		this.mobileNo = mobileNo;
		this.movieName = movieName;
		this.bookingDate = bookingDate;
		this.showDate = showDate;
		this.showTime = showTime;
		this.seatType = seatType;
		this.typeOfSeat = typeOfSeat;
		this.paymentType = paymentType;
		this.transactionId = transactionId;
		this.status = status;
		this.amount = amount;
	}

	public String getTicketID() {
		return ticketID;
	}

	public void setTicketID(String ticketID) {
		this.ticketID = ticketID;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getShowDate() {
		return showDate;
	}

	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}

	public Date getShowTime() {
		return showTime;
	}

	public void setShowTime(Date showTime) {
		this.showTime = showTime;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	public String getTypeOfSeat() {
		return typeOfSeat;
	}

	public void setTypeOfSeat(String typeOfSeat) {
		this.typeOfSeat = typeOfSeat;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Ticket [ticketID=" + ticketID + ", mobileNo=" + mobileNo + ", movieName=" + movieName + ", bookingDate="
				+ bookingDate + ", showDate=" + showDate + ", showTime=" + showTime + ", seatType=" + seatType
				+ ", typeOfSeat=" + typeOfSeat + ", paymentType=" + paymentType + ", transactionId=" + transactionId
				+ ", status=" + status + ", amount=" + amount + "]";
	}

}
