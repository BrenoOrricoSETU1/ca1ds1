package org.example;

public class Guest {
    private String guestId;
    private String guestName;
    private String guestDOB;
    private String guestContact;
    private String guestAdditionalInfo;


    public Guest(String guestId, String guestName, String guestDOB, String guestContact, String guestAdditionalInfo) {
        this.guestId = guestId;
        this.guestName = guestName;
        this.guestDOB = guestDOB;
        this.guestContact = guestContact;
        this.guestAdditionalInfo = guestAdditionalInfo;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setGuestDOB(String guestDOB) {
        this.guestDOB = guestDOB;
    }

    public void setGuestContact(String guestContact) {
        this.guestContact = guestContact;
    }

    public void setGuestAdditionalInfo(String guestAdditionalInfo) {
        this.guestAdditionalInfo = guestAdditionalInfo;
    }

    public String getGuestAdditionalInfo() {
        return guestAdditionalInfo;
    }

    public String getGuestContact() {
        return guestContact;
    }

    public String getGuestDOB() {
        return guestDOB;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getGuestId() {
        return guestId;
    }

    @Override
    public String toString() {
        return "Name: " + guestName + " -> ID: " + guestId + "\nD.O.B: " + guestDOB + "\nContact: " + guestContact + "\nAdditional Info: " + guestAdditionalInfo + "\n";
    }
}
