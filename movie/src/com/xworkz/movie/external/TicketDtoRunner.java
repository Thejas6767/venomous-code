package com.xworkz.movie.external;


import com.xworkz.movie.dto.TicketDto;

public class TicketDtoRunner {
    public static void main(String[] args) {
        TicketDto ticket1 = new TicketDto();
        ticket1.setTicketID(801);
        ticket1.setBookingReference(123456789012L);
        ticket1.setIsETicket(true);
        ticket1.setSeatingSection('P');
        ticket1.setTicketPrice(450.0);
        ticket1.setServiceCharge(25.5f);
        ticket1.setMovieTitle("The Final Code");
        ticket1.setShowTime("10:00 PM");
        ticket1.setSeatNumber(22);
        ticket1.setTransactionID(9876543210L);
        ticket1.setDiscountApplied(50.0);
        ticket1.setScreenNumber(3.0f);
        ticket1.setIsCanceled(false);

        System.out.println("---- TICKET DETAILS ----");
        System.out.println(ticket1);
    }
}
