package org.example;

public class GuestData {
    public static GuestList guests =  new GuestList();

    private static int nextGuestId = 0;

    public static String getNextGuestId() {
        String id = "G" + nextGuestId;
        nextGuestId++;
        return id;
    }
}
