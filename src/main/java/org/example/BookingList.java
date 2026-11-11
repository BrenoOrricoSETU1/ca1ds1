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
    public BookingNode getHead() {
        return head;
    }
}
