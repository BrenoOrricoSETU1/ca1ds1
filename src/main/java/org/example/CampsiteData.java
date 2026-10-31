package org.example;

public class CampsiteData {
    public static CampsiteList campsites =  new CampsiteList();

    public static void defaultCampsites(){
        //Area 1
        Campsite campsite1 = new Campsite(
                "Pleasant View",
                "1939 Somewhere Over the Rainbow",
                5,
                "678 999 8212",
                "Gym, Local Shop, Laundry"
        );
        CampingArea area1 = new CampingArea("PVA1", "Family Area");
        Plot plot1 = new Plot("PVP1","Fixed", true, 5, 10, 80, "WiFi, Air Conditioner Unit", 120, "");
        Plot plot2 = new Plot("PVP2", "Touring", false, 0, 0, 100, "Cold Drink, Sun Glasses, Sun Cream", 15, "");

        //Area 2
        Campsite campsite2 = new Campsite(
                "Anor Londo",
                "1 Firelink Shrine, Lordran",
                4,
                "000 666 6769",
                "Bonfire, Blacksmith, Cathedral, Sunlight Altar"
        );
        CampingArea area2 = new CampingArea("PVA2", "Sunlight Warriors Area");
        Plot plot3 = new Plot("ALP1",
                "Fixed",
                true,
                4,
                8,
                300,
                "Estus Flask, Praise the Sun",
                150,
                ""
                );
        Plot plot4 = new Plot("ALP2", "Touring", false, 0, 0, 300, "Silver Knight Security, Gorgeous View", 30, "");

        //Area 3
        Campsite campsite3 = new Campsite(
                "Hogwarts",
                "9¾ King's Cross, London, England",
                5,
                "000 934 1997",
                "Great Hall, Buterbeer Bar, Quidditch Picth, Owl Post, not-WiFi"
        );
        CampingArea area3 = new CampingArea("H1", "Gryffindor Common Grounds");
        Plot plot5 = new Plot("HP1", "Fixed", true, 500, 1000, 15000, "Magic Fireplace, Enchanted Beds, House Elf Service", 0, "");

        //TO DO: HAVE TO FIX THIS LATER ON, IT IS NOT GETTING THE OTHER CAMPING AREAS aaaaaaaaaaaaaaargh
        area1.getPlots().addPlot(plot1);
        area1.getPlots().addPlot(plot2);
        campsite1.getCampingAreas().addCampingArea(area1);

        area2.getPlots().addPlot(plot3);
        area2.getPlots().addPlot(plot4);
        campsite2.getCampingAreas().addCampingArea(area2);

        area3.getPlots().addPlot(plot5);
        campsite3.getCampingAreas().addCampingArea(area3);

        campsites.addCampsite(campsite1);
        campsites.addCampsite(campsite2);
        campsites.addCampsite(campsite3);
    }
}
