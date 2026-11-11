package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CampsiteTest {
    @Test
    public void testFindAlternativePlot(){
        Campsite campsite = new Campsite("Test Camp",
                "Test Address",
                4,
                "12345",
                "Pool");

        CampingArea area = new CampingArea("A1",
                "Main Area");

        Plot oldPlot = new Plot("P1",
                "Fixed",
                true,
                2,
                4,
                50,
                "Pool",
                100,
                "");

        Plot alternativePlot = new Plot("P2",
                "Fixed",
                true,
                3,
                5,
                70,
                "Pool",
                120,
                "");

        area.getPlots().addPlot(oldPlot);
        area.getPlots().addPlot(alternativePlot);

        campsite.getCampingAreas().addCampingArea(area);
        Plot result = campsite.findAlternativePlot("P1",
                "Fixed",
                40,
                2,
                150);

        assertEquals("P2", result.getPlotId());
    }
}
