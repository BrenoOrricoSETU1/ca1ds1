package org.example;

public class Booking {
    private String bookingId;
    private String startingDate;
    private String endDate;
    private String campingAreaId;
    private String guestId;
    private String prefType;
    private int numberOfGuests;
    private boolean powered;
    private double minSize;
    private int minBedrooms;
    private double budget;
    private String plotId;

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCampingAreaId() {
        return campingAreaId;
    }

    public void setCampingAreaId(String campingAreaId) {
        this.campingAreaId = campingAreaId;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public String getPrefType() {
        return prefType;
    }

    public void setPrefType(String prefType) {
        this.prefType = prefType;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public boolean isPowered() {
        return powered;
    }

    public void setPowered(boolean powered) {
        this.powered = powered;
    }

    public double getMinSize() {
        return minSize;
    }

    public void setMinSize(double minSize) {
        this.minSize = minSize;
    }

    public int getMinBedrooms() {
        return minBedrooms;
    }

    public void setMinBedrooms(int minBedrooms) {
        this.minBedrooms = minBedrooms;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getPlotId() {
        return plotId;
    }

    public void setPlotId(String plotId) {
        this.plotId = plotId;
    }

    public Booking(String bookingId, String startingDate, String endDate, String campingAreaId, String guestId, String plotId, String prefType, int numberOfGuests, boolean powered, double minSize, int minBedrooms, double budget) {
        this.bookingId = bookingId;
        this.startingDate = startingDate;
        this.endDate = endDate;
        this.campingAreaId = campingAreaId;
        this.guestId = guestId;
        this.plotId = plotId;
        this.prefType = prefType;
        this.numberOfGuests = numberOfGuests;
        this.powered = powered;
        this.minSize = minSize;
        this.minBedrooms = minBedrooms;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Booking ID: " + this.bookingId + ", Guest ID: " + this.guestId + "\nCamping Area: " + this.campingAreaId + ", Plot ID: " + this.plotId + "\nStart Date: " +  this.startingDate + ", End Date: " + this.endDate;
    }
}
