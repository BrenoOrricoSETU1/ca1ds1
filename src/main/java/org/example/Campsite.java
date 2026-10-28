package org.example;

public class Campsite {
    private String campsiteName;
    private String campsiteAddress;
    private int stars;
    private String campsiteContact;
    private String facilities;

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

    @Override
    public String toString() {
        return "Campsite: " + campsiteName + "- " + campsiteAddress + "- " + stars + "- " + campsiteContact ;
    }
}
