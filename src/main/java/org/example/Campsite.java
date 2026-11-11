package org.example;

public class Campsite {
    private String campsiteName;
    private String campsiteAddress;
    private int stars;
    private String campsiteContact;
    private String facilities;

    private CampingAreaList campingAreas = new CampingAreaList();

    public Campsite(String campsiteName, String campsiteAddress, int stars, String campsiteContact, String facilities) {
        this.campsiteName = campsiteName;
        this.campsiteAddress = campsiteAddress;
        this.stars = stars;
        this.campsiteContact = campsiteContact;
        this.facilities = facilities;
    }

    public String getCampsiteName() {
        return campsiteName;
    }
    public String getCampsiteAddress() {
        return campsiteAddress;
    }
    public int getStars() {
        return stars;
    }
    public String getCampsiteContact() {
        return campsiteContact;
    }
    public String getFacilities() {
        return facilities;
    }

    public CampingAreaList getCampingAreas(){
        return campingAreas;
    }

    public Plot findAlternativePlot(String deletedPlotId, String type, double minSize, int minBedrooms, double budget) {

        CampingAreaNode areaNode = campingAreas.getHead();

        while (areaNode != null) {
            CampingArea campingArea = areaNode.getData();
            PlotNode plotNode = campingArea.getPlots().getHead();

            while (plotNode != null) {
                Plot plot = plotNode.getData();
                if (!plot.getPlotId().equalsIgnoreCase(deletedPlotId) && plot.getType().equalsIgnoreCase(type) && plot.getSize() >= minSize && plot.getBedrooms() >= minBedrooms && plot.getCostPerNight() <= budget) {
                    return plot;
                }
                plotNode = plotNode.getNext();
            }
            areaNode = areaNode.getNext();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Campsite: " + campsiteName + "- Location: " + campsiteAddress + "- Stars: " + stars + "- Contact: " + campsiteContact ;
    }
}
