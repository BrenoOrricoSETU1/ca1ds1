package org.example;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DataStore {

    public void save() throws Exception {

        XStream xstream = new XStream(new DomDriver());

        ObjectOutputStream out =
                xstream.createObjectOutputStream(
                        new FileWriter("campsiteData.xml")
                );

        AppData data = new AppData(
                CampsiteData.campsites,
                GuestData.guests,
                BookingData.bookings
        );

        out.writeObject(data);

        out.close();
    }

    @SuppressWarnings("unchecked")
    public void load() throws Exception {

        Class<?>[] classes = new Class[] {
                AppData.class,
                CampsiteList.class,
                CampsiteNode.class,
                Campsite.class,
                CampingAreaList.class,
                CampingAreaNode.class,
                CampingArea.class,
                PlotList.class,
                PlotNode.class,
                Plot.class,
                GuestList.class,
                GuestNode.class,
                Guest.class,
                BookingList.class,
                BookingNode.class,
                Booking.class
        };

        XStream xstream = new XStream(new DomDriver());

        XStream.setupDefaultSecurity(xstream);
        xstream.allowTypes(classes);

        ObjectInputStream in =
                xstream.createObjectInputStream( new FileReader("campsiteData.xml")
                );

        AppData data = (AppData) in.readObject();

        CampsiteData.campsites = data.getCampsites();
        GuestData.guests = data.getGuests();
        BookingData.bookings = data.getBookings();

        in.close();
    }
}