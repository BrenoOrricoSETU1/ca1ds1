package org.example;

import java.time.LocalDate;

public class BookingList {
    private BookingNode head;

    public void addBooking(Booking booking) {
        BookingNode newNode = new BookingNode(booking);

        if(head == null) {
            head = newNode;
        } else{
            BookingNode current = head;
            while(current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public String displayBookings(){
        String output = "";
        BookingNode current = head;

        while(current != null) {
            output += current.getData().toString() + "\n";
            current = current.getNext();
        }
        return output;
    }

    public boolean cancelBooking(String bookingId){
        if(head == null){
            return false;
        }
        if(head.getData().getBookingId().equalsIgnoreCase(bookingId)){
            head = head.getNext();
            return true;
        }

        BookingNode current = head;

        while(current.getNext() != null) {
            if(current.getData().getBookingId().equalsIgnoreCase(bookingId)){
                current.setNext(current.getNext().getNext());
                return true;
            }

            current = current.getNext();
        }
        return false;
    }

    public boolean isPlotBooked(String plotId, String startDate, String endDate) {
        LocalDate newStartDate = LocalDate.parse(startDate);
        LocalDate newEndDate = LocalDate.parse(endDate);

        BookingNode current = head;

        while(current != null) {
            Booking booking = current.getData();

            if(booking.getPlotId().equalsIgnoreCase(plotId)) {
                LocalDate existingStart = LocalDate.parse(booking.getStartingDate());
                LocalDate existingEnd = LocalDate.parse(booking.getEndDate());

                if(!newEndDate.isBefore(existingStart) && !newStartDate.isAfter(existingEnd)){
                    return true;
                }
            }
            current = current.getNext();
        }
        return false;
    }

    public String displayBookingsByGuestId(String guestId){
        String output = "";
        BookingNode current = head;

        while(current != null) {
            if(current.getData().getGuestId().equalsIgnoreCase(guestId)) {
                output = current.getData().toString() + "\n";
            }
            current = current.getNext();
        }
        if(output.equals("")){
            return "No bookings yet";
        }
        return output;
    }

    public BookingNode getHead() {
        return head;
    }
}
