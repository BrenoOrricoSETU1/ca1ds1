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

    public String findBestPlot(String type, double minSize, int minBedrooms, double budget, String facilities){

        String exactMatch = "";
        String bestMatch = "";
        int bestScore = 0;

        CampsiteNode campsiteNode = head;

        while(campsiteNode != null){

            Campsite campsite = campsiteNode.getData();

            CampingAreaNode areaNode = campsite.getCampingAreas().getHead();

            while(areaNode != null){

                CampingArea campingArea = areaNode.getData();

                PlotNode plotNode = campingArea.getPlots().getHead();

                while(plotNode != null){

                    Plot plot = plotNode.getData();

                    if(plot.getType().equalsIgnoreCase(type) && plot.getSize() >= minSize && plot.getBedrooms() >= minBedrooms && plot.getCostPerNight() <= budget && plot.getFacilities().toLowerCase().contains(facilities.toLowerCase())){
                        exactMatch += "Campsite: " + campsite.getCampsiteName()
                                + "\nCamping Area: " + campingArea.getAreaID()
                                + "\n" + plot.toString() + "\n";

                    } else {

                        int score = 0;

                        if(plot.getType().equalsIgnoreCase(type)){
                            score++;
                        }

                        if(plot.getSize() >= minSize){
                            score++;
                        }

                        if(plot.getBedrooms() >= minBedrooms){
                            score++;
                        }

                        if(plot.getCostPerNight() <= budget){
                            score++;
                        }

                        if(plot.getFacilities().toLowerCase().contains(facilities.toLowerCase())){
                            score++;
                        }

                        if(score > bestScore){

                            bestScore = score;

                            bestMatch = "Campsite: " + campsite.getCampsiteName()
                                    + "\nCamping Area: " + campingArea.getAreaID()
                                    + "\n" + plot.toString() + "\n";

                        } else if(score == bestScore){

                            bestMatch += "Campsite: " + campsite.getCampsiteName()
                                    + "\nCamping Area: " + campingArea.getAreaID()
                                    + "\n" + plot.toString() + "\n";
                        }
                    }

                    plotNode = plotNode.getNext();
                }

                areaNode = areaNode.getNext();
            }

            campsiteNode = campsiteNode.getNext();
        }

        if(!exactMatch.equals("")){
            return "\nThe best plot found:\n" + exactMatch;
        }

        if(!bestMatch.equals("")){
            return "\nThere is no plot that matches all your preferences, we recommend:\n" + bestMatch;
        }

        return "There is no plot that matches your preferences";
    }

    public void reset(){
        head = null;
    }

    public CampsiteNode getHead() {
        return head;
    }
}
