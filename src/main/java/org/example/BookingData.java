package org.example;

public class BookingData {
    public static BookingList bookings = new BookingList();

    private static int nextBookingId = 1;

    public static String getNextBookingId() {
        String id = "B"  + nextBookingId;
        nextBookingId++;
        return id;
    }
}
