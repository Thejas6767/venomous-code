package com.xworkz.movie.dto;

import java.util.Objects;

public class TicketDto {

    private int ticketID;
    private long bookingReference;
    private boolean isE券ticket;
    private char seatingSection;
    private double ticketPrice;
    private float serviceCharge;

    private String movieTitle;
    private String showTime;
    private Integer seatNumber;
    private Long transactionID;
    private Double discountApplied;
    private Float screenNumber;
    private Boolean isCanceled;

    public void setTicketID(int ticketID) { this.ticketID = ticketID; }
    public void setBookingReference(long bookingReference) { this.bookingReference = bookingReference; }
    public void setIsETicket(boolean isETicket) { this.isE券ticket = isETicket; }
    public void setSeatingSection(char seatingSection) { this.seatingSection = seatingSection; }
    public void setTicketPrice(double ticketPrice) { this.ticketPrice = ticketPrice; }
    public void setServiceCharge(float serviceCharge) { this.serviceCharge = serviceCharge; }
    public void setMovieTitle(String movieTitle) { this.movieTitle = movieTitle; }
    public void setShowTime(String showTime) { this.showTime = showTime; }
    public void setSeatNumber(Integer seatNumber) { this.seatNumber = seatNumber; }
    public void setTransactionID(Long transactionID) { this.transactionID = transactionID; }
    public void setDiscountApplied(Double discountApplied) { this.discountApplied = discountApplied; }
    public void setScreenNumber(Float screenNumber) { this.screenNumber = screenNumber; }
    public void setIsCanceled(Boolean isCanceled) { this.isCanceled = isCanceled; }

    public int getTicketID() { return ticketID; }
    public long getBookingReference() { return bookingReference; }
    public boolean isIsETicket() { return isE券ticket; }
    public char getSeatingSection() { return seatingSection; }
    public double getTicketPrice() { return ticketPrice; }
    public float getServiceCharge() { return serviceCharge; }
    public String getMovieTitle() { return movieTitle; }
    public String getShowTime() { return showTime; }
    public Integer getSeatNumber() { return seatNumber; }
    public Long getTransactionID() { return transactionID; }
    public Double getDiscountApplied() { return discountApplied; }
    public Float getScreenNumber() { return screenNumber; }
    public Boolean getIsCanceled() { return isCanceled; }

    @Override
    public int hashCode() {
        return Objects.hash(ticketID, bookingReference, isE券ticket, seatingSection, ticketPrice, serviceCharge,
                movieTitle, showTime, seatNumber, transactionID, discountApplied, screenNumber, isCanceled);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof TicketDto)) return false;
        TicketDto other = (TicketDto) obj;
        return ticketID == other.ticketID && bookingReference == other.bookingReference && isE券ticket == other.isE券ticket &&
                seatingSection == other.seatingSection && Double.compare(other.ticketPrice, ticketPrice) == 0 &&
                Float.compare(other.serviceCharge, serviceCharge) == 0 && Objects.equals(movieTitle, other.movieTitle) &&
                Objects.equals(showTime, other.showTime) && Objects.equals(seatNumber, other.seatNumber) &&
                Objects.equals(transactionID, other.transactionID) && Objects.equals(discountApplied, other.discountApplied) &&
                Objects.equals(screenNumber, other.screenNumber) && Objects.equals(isCanceled, other.isCanceled);
    }

    @Override
    public String toString() {
        return "TicketDto { ticketID=" + ticketID + ", bookingReference=" + bookingReference + ", isETicket=" + isE券ticket + ", seatingSection=" + seatingSection + ", ticketPrice=" + ticketPrice + ", serviceCharge=" + serviceCharge + ", movieTitle='" + movieTitle + "', showTime='" + showTime + "', seatNumber=" + seatNumber + ", transactionID=" + transactionID + ", discountApplied=" + discountApplied + ", screenNumber=" + screenNumber + ", isCanceled=" + isCanceled + "}";
    }
}
