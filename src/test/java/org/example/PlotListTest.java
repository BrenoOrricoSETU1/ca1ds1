package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlotListTest {

    @Test
    public void testAddPlot() {

        PlotList plotList = new PlotList();

        Plot plot = new Plot(
                "P1",
                "Fixed",
                true,
                2,
                4,
                60,
                "Pool",
                100,
                ""
        );
        plotList.addPlot(plot);
        assertEquals(
                plot,
                plotList.findPlotById("P1")
        );
    }

    @Test
    public void testRemovePlot() {
        PlotList plotList = new PlotList();
        Plot plot = new Plot("P1",
                "Fixed",
                true,
                2,
                4,
                60,
                "Pool",
                100,
                "");
        plotList.addPlot(plot);
        boolean removed = plotList.removePlot("P1");
        assertTrue(removed);
        assertNull(plotList.findPlotById("P1"));
    }
}