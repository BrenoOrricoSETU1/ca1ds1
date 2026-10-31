package org.example;

public class Plot {
    private String plotId;
    private String type;
    private boolean powered;
    private int bedrooms;
    private int beds;
    private double size;
    private String facilities;
    private double costPerNight;
    private String photoUrl;

    public Plot(String plotId, String type, boolean powered, int bedrooms, int beds, double size, String facilities, double costPerNight, String photoUrl) {
        this.plotId = plotId;
        this.type = type;
        this.powered = powered;
        this.bedrooms = bedrooms;
        this.beds = beds;
        this.size = size;
        this.facilities = facilities;
        this.costPerNight = costPerNight;
        this.photoUrl = photoUrl;
    }
    public String getPlotId() {
        return plotId;
    }

    public String getType() {
        return type;
    }

    public boolean isPowered() {
        return powered;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBeds() {
        return beds;
    }

    public double getSize() {
        return size;
    }

    public String getFacilities() {
        return facilities;
    }

    public double getCostPerNight() {
        return costPerNight;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPlotId(String plotId) {
        this.plotId = plotId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPowered(boolean powered) {
        this.powered = powered;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public void setCostPerNight(double costPerNight) {
        this.costPerNight = costPerNight;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    @Override
    public String toString() {
        return "Type: " + type + "\n€" + costPerNight + " per night";
    }
}

