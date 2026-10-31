package org.example;

public class CampingArea {

    private String areaID;
    private String description;
    private PlotList plots = new PlotList();

    public CampingArea(String areaID, String description) {
        this.areaID = areaID;
        this.description = description;
    }

    public String getAreaID() {
        return areaID;
    }

    public void setAreaID(String areaID) {
        this.areaID = areaID;
    }

    public PlotList getPlots() {
        return plots;
    }

    @Override
    public String toString() {
        return "Area ID: " + areaID + ", description: " + description;
    }
}
