package org.example;

public class GuestNode {
    private Guest data;
    private GuestNode next;

    public GuestNode(Guest data) {
        this.data = data;
        this.next = null;
    }

    public Guest getData() {

        return data;
    }

    public void setData(Guest data) {

        this.data = data;
    }

    public GuestNode getNext() {

        return next;
    }

    public void setNext(GuestNode next) {

        this.next = next;
    }
}
