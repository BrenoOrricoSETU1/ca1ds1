package org.example;

public class BookingNode {
    private Booking data;
    private BookingNode next;

    public BookingNode(Booking data) {
        this.data = data;
        this.next = null;
    }

    public Booking getData() {
        return data;
    }
    public void setData(Booking data) {
        this.data = data;
    }

    public BookingNode getNext() {
        return next;
    }

    public void setNext(BookingNode next) {
        this.next = next;
    }
}
