package org.example;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GuestListTest {

    @Test
    public void testAddGuest() {
        GuestList guestList = new GuestList();

        Guest guest = new Guest(
                "G1",
                "Patrick Meyler",
                "11/10/1980",
                "12345678",
                "Test Info"
        );

        guestList.addGuest(guest);
        assertEquals(guest, guestList.findGuestById("G1")
        );
    }
}