package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CampsiteListTest {
    @Test
    public void testAddCampsite(){

        CampsiteList campsiteList = new CampsiteList();
        Campsite campsite = new Campsite(
                "Test Campsite",
                "Test Address",
                4,
                "123456",
                "Pool"
        );
        campsiteList.addCampsite(campsite);
        assertEquals(campsite, campsiteList.findCampsiteByName("Test Campsite"));
    }

    @Test
    public void testDisplayCampsite(){
        CampsiteList campsiteList = new CampsiteList();
        Campsite campsite = new Campsite("Test Campsite",
                "Test Address",
                4,
                "12345",
                "Pool");
        campsiteList.addCampsite(campsite);
        String result = campsiteList.displayCampsites();
        assertTrue(result.contains("Test Campsite"));
    }

    @Test
    public void testFindBestPlot(){
        CampsiteList campsiteList = new CampsiteList();
        Campsite campsite = new Campsite("Test Camp",
                "Test Address",
                4,
                "1234567",
                "Pool");

        CampingArea area = new CampingArea("A1",
                "Main Area");

        Plot plot = new Plot("P1",
                "Fixed",
                true,
                2,
                4,
                60,
                "Swimming Pool",
                120,
                "");

        area.getPlots().addPlot(plot);
        campsite.getCampingAreas().addCampingArea(area);

        campsiteList.addCampsite(campsite);

        String result = campsiteList.findBestPlot("Fixed",
                50,
                2,
                150,
                "Swimming Pool");

        assertTrue(result.contains("P1"));
    }
}
