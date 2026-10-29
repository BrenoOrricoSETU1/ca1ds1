package org.example;

public class CampingArea {

    private String areaID;
    private String description;

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

    @Override
    public String toString() {
        return "Area ID: " + areaID + ", description: " + description;
    }
}
