package org.example;

public class AppData {

    private CampsiteList campsites;
    private GuestList guests;
    private BookingList bookings;

    public AppData(CampsiteList campsites,
                   GuestList guests,
                   BookingList bookings) {

        this.campsites = campsites;
        this.guests = guests;
        this.bookings = bookings;
    }

    public CampsiteList getCampsites() {
        return campsites;
    }

    public GuestList getGuests() {
        return guests;
    }

    public BookingList getBookings() {
        return bookings;
    }
}