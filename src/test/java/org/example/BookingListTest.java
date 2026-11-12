package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookingListTest {

    @Test
    public void testAddBooking(){
        BookingList bookingList = new BookingList();
        Booking booking = new Booking("B1",
                "2026-11-20",
                "2026-11-25",
                "A1",
                "G1",
                "P1",
                "Fixed",
                2,
                true,
                40,
                1,
                150);
        bookingList.addBooking(booking);
        assertTrue(bookingList.displayBookings().contains("B1"));
    }
    @Test
    public void testCancelBooking() {
        BookingList bookingList = new BookingList();
        Booking booking = new Booking("B1",
                "2026-11-20",
                "2026-11-25",
                "A1",
                "G1",
                "P1",
                "Fixed",
                2,
                true,
                40,
                1,
                150);

        bookingList.addBooking(booking);
        boolean cancelled = bookingList.cancelBooking("B1");
        assertTrue(cancelled);
    }

    @Test
    public void testCancelBookingNotFound() {
        BookingList bookingList = new BookingList();
        assertFalse(bookingList.cancelBooking("B999"));
    }

    @Test
    public void testDisplayBookingsByGuestId(){

        BookingList bookingList = new BookingList();

        Booking booking = new Booking(
                "B1",
                "2026-11-20",
                "2026-11-25",
                "A1",
                "G1",
                "P1",
                "Fixed",
                2,
                true,
                40,
                1,
                150
        );

        bookingList.addBooking(booking);
        String result = bookingList.displayBookingsByGuestId("G1");
        System.out.println(result);
        assertTrue(result.contains("B1"));
    }
}
