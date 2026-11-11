package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CampingAreaListTest {

    @Test
    void testAddAndFindCampingArea() {

        CampingAreaList campingAreaList = new CampingAreaList();

        CampingArea area = new CampingArea(
                "A1",
                "Family Area"
        );

        campingAreaList.addCampingArea(area);

        assertEquals(
                area,
                campingAreaList.findCampingAreaById("A1")
        );
    }
}