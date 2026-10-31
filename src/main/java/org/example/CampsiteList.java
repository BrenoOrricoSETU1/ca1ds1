package org.example;

public class CampsiteList {
    private CampsiteNode head;

    public void addCampsite(Campsite campsite) {
        CampsiteNode newNode = new CampsiteNode(campsite);
        if (head == null) {
            head = newNode;
        } else{
            CampsiteNode current = head;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public String displayCampsites(){
        String output = "";

        for(CampsiteNode campsiteNode = head; campsiteNode != null; campsiteNode = campsiteNode.getNext()){
            Campsite campsite = campsiteNode.getData();
            output += campsite + "\n";

            for(CampingAreaNode areaNode = campsite.getCampingAreas().getHead(); areaNode != null; areaNode = areaNode.getNext()){
                CampingArea campingArea = areaNode.getData();
                output += campingArea + "\n";

                for (PlotNode plotNode = areaNode.getData().getPlots().getHead(); plotNode != null;  plotNode = plotNode.getNext()){
                    output += plotNode.getData() + "\n";
                }
            }
            output += "\n";
        }
        return output;
    }

    public Campsite findCampsiteByName(String name){
        for(CampsiteNode current = head; current != null; current = current.getNext()){
            if(current.getData().getCampsiteName().equalsIgnoreCase(name)){
                return current.getData();
            }
        }
        return null;
    }
}
